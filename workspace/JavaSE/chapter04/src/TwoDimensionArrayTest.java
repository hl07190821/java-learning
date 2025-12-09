/**
 * ClassName: TwoDimensionArrayTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/10 20:25
 * @Version 1.0
 */
//二维数组初始化
class TwoDimensionArrayTest {
    public static void main(String[] args) {
        int[] x,y[];
        //x是一维数组，y二维数组
    }
}

class TwoDimensionArrayTest01{
    public static void main(String[] args) {
        //静态初始化
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] arr01 = new int[][]{{1,2,3},{1,2,3},{1,2,3}};

        int[][] arr02;
        arr02 = new int[][]{{1,2,3},{1,2,3},{1,2,3,4,5}};

        //arr new int[3][3]{{1,2,3},{1,2,3},{1,2,3}};//错误，静态初始化不能直接定义数组长度

        //动态初始化
        //格式1，所有行的列数相同
        int[][] arr03 = new int[3][3];
        //前面3表示有3个一维数组
        //后面3表示每个一维数组的长度

        //格式2，每一行的列数不一样
        //先确定总行数
        int[][] arr04 = new int[4][];
        //确定每一行的列数
        arr04[1] = new int[5];
        //显示有多少行
        System.out.println(arr04.length);
        //报错，因为第一行没有初始化，cannot read array length
        //System.out.println(arr04[0].length);

        //显示第2行有多少列
        System.out.println(arr04[1].length);
        //为元素赋值
    }
}

//遍历一个每行的列数不相同的二维数组
class TwoDimensionArrayTest02{
    public static void main(String[] args) {
        //声明一个二维数组，并确定行数
        int[][] arr = new int[3][];

        //初始化每行的列数
        for(int i = 0;i< arr.length;i++){
            arr[i] = new int[i+1];
        }

        //确定元素的值
        for(int i = 0;i< arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                arr[i][j] = i*j;
                System.out.println("第"+(i+1)+"行"+"第"+(j+1)+"列的数是："+arr[i][j]);
            }
        }
    }
}

class TwoDimensionArrayTest03{
    public static void main(String[] args) {
        //存储三个小组学员的成绩，分开存储，使用二维数组
        /*
        int[][] score1;
        int score2[][];
        int[] score3[];
        */

        int[][] scores = {
            {85,96,85,75},
            {99,96,74,72,75},
            {53,42,56,75}
        };

        System.out.println(scores);

        System.out.println("一共有"+scores.length+"组成绩");

        //[[代表是二维数组，I代表元素类型是int
        System.out.println(scores[0]);
        //[代表是一维数组，I代表元素类型是int
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        System.out.println("第1组有"+scores[0].length+"个学生");
        System.out.println("第2组有"+scores[1].length+"个学生");
        System.out.println("第3组有"+scores[2].length+"个学生");

        System.out.println("第一组的每个学员的成绩如下：");

        System.out.println(scores[0][0]);
        System.out.println(scores[0][1]);
        System.out.println(scores[0][2]);
        System.out.println(scores[0][3]);
    }
}

/*
声明：int[] x,y[]; 在给x,y变量赋值以后，以下选项允许通过编译的是：
a)    x[0] = y;                 //no
b)    y[0] = x;                 //yes,引用赋值，使y[0]指向和x指向相同的数组
c)    y[0][0] = x;              //no
d)    x[0][0] = y;              //no
e)    y[0][0] = x[0];           //yes，值赋值
f)    x = y;                    //no

提示：
一维数组：int[] x  或者int x[]
二维数组：int[][] y 或者  int[] y[]  或者 int  y[][]
 */

/*案例3：**使用二维数组打印一个 10 行杨辉三角。

提示：

1. 第一行有 1 个元素, 第 n 行有 n 个元素

2. 每一行的第一个元素和最后一个元素都是 1

3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j]
*/

class TwoDimensionArrayTest04{
    public static void main(String[] args) {
        //定义一个二维数组，存储10行杨辉三角
        int[][] yangHui = new int[10][];
        /*
        //为每一行定义列数
        for(int i = 0;i< yangHui.length;i++){
            yangHui[i] = new int[i+1];
        }
        //为每一行赋值
        for(int i = 0;i< yangHui.length;i++){
            for(int j = 0;j<yangHui[i].length;j++){
                if(j == 0||j==yangHui[i].length-1){
                    yangHui[i][j] = 1;
                } else {
                    yangHui[i][j] = yangHui[i-1][j-1]+ yangHui[i-1][j];
                }
            }
        }
        //输出杨辉三角
        for(int i=0;i< yangHui.length;i++){
            for(int j = 0;j<yangHui[i].length;j++){
                if(j == yangHui[i].length-1){
                    //如果杨辉三角每行最后一个数字，使用println
                    System.out.println(yangHui[i][j]);
                }else{
                    System.out.print(yangHui[i][j]+" ");
                }
            }
        }

    */
        //更好的方案，使用更少的循环
        for(int i = 0;i< yangHui.length;i++){
            //为每行设置组数
            yangHui[i] = new int[i+1];
            //给外层数组元素中的首元素和末元素赋值
            yangHui[i][0] = yangHui[i][i] = 1;
            for(int j = 1;j<yangHui[i].length-1;j++) {
                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
            }
        }
        //遍历数组
        for (int i = 0;i< yangHui.length;i++){
            System.out.println("");
            for(int j= 0;j< yangHui[i].length;j++){
                System.out.print(" "+yangHui[i][j]);
            }
        }
    }
}


