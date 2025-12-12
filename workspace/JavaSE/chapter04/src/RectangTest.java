import java.util.Scanner;

/**
 * ClassName: RectangTets
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/11 22:44
 * @Version 1.0
 */

//报错：问题出在遍历
//注意填充数字的时候是从m=1开始，<=s结束
//但是遍历的时候，是从m=0开始，<s结束
public class RectangTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入1-20的整数用于生成回形数：");

        int len = scanner.nextInt();

        int[][] arr = new int[len][len];

        int s = len*len;
        int k = 1;
        /*
        * k = 1：向右
        * k = 2：向下
        * k = 3：向左
        * k = 4：向上
        * */
        //设置行数表示
        int i = 0;
        //设置列数表示
        int j = 0;
        //把m依次填入数组

        /*
         * k = 1：向右
         * k = 2：向下
         * k = 3：向左
         * k = 4：向上
         * */

//        for (int m = 1;m <= s;m++){
//            //k=1,表示向右填入数字
//            if(k == 1){
//
//               不能判断是否拐弯
//
//                1，当列数超过长度
//                2，当遍历的数组元素为空（默认是0），非拐弯情况进行拐弯
//                if(j > len||arr[i][j]==0 ){
//
//                }
//                //只能判断什么时候向右
                  //细节为括号里使用&&，防止超出索引访问数组
//                if(j < len && arr[i][j] == 0){
//                    arr[i][j++] = m;
//                } else{
//                    //重新填入m,执行向下操作
//                    m--;
//                    //现在所在位置在目标位置的右上方
//                    j--;
//                    i++;
//                    k = 2;
//                }
//
//            } else if (k == 2) {
//                //执行向下操作
//                if (i < len && arr[i][j]==0){
//                    arr[i++][j] = m;
//                }else {
//                    //重新填入m，执行向左操作
//                    m--;
//                    //现在所在位置在目标位置的右下方
//                    i--;
//                    j--;
//                    k = 3;
//                }
//            } else if (k == 3) {
//                if (j >= 0 &&arr[i][j] == 0){
//                    arr[i][j--] = m;
//                }else {
//                    //重新填入m，执行向上操作
//                    m--;
//                    //现在所在位置在目标位置的左下方
//                    j++;
//                    i--;
//                    k=4;
//                }
//            }else if(k == 4) {
//                if (i >= 0 &&arr[i][j] == 0) {
//                    arr[i--][j] = m;
//                } else {
//                    //重新填入m，执行向右操作
//                    m--;
//                    //现在位置在目标位置的左上方
//                    i++;
//                    j++;
//                    k = 1;
//                }
//            }
//        }
        //使用switch-case
        for (int m = 1; m<=s;m++){
            switch(k){
                case 1:
                    if(j<len && arr[i][j]==0){
                        arr[i][j++] = m;
                    }else {
                        m--;
                        i++;
                        j--;
                        k=2;
                    }
                    break;
                case 2:
                    if(i<len && arr[i][j]==0){
                        arr[i++][j] = m;
                    }else {
                        m--;
                        j--;
                        i--;
                        k=3;
                    }
                    break;
                case 3:
                    if(j>=0 && arr[i][j] == 0){
                        arr[i][j--] = m;
                    }else {
                        m--;
                        i--;
                        j++;
                        k=4;
                    }
                    break;
                case 4:
                    if (i>=0 && arr[i][j] ==0){
                        arr[i--][j] = m;
                    }else {
                        m--;
                        j++;
                        i++;
                        k=1;
                    }
                    break;
            }
        }
        //遍历
        for (int m = 0;m< arr.length;m++){
            for (int n = 0;n<arr[m].length;n++){
                System.out.print(arr[m][n]+"\t");
            }
            System.out.println();
        }
    }
}

//更优雅的螺旋矩阵收缩算法
//边界自动收缩算法


class TectangTest01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个0-20的整数，用于生成回形数字：");

        int len = scanner.nextInt();
        int[][] arr = new int[len][len];

        //定义计数器
        int count = 1;
        //定义左边界
        int minX = 0;
        //定义上边界
        int minY = 0;
        //定义右边界
        //注意右边界是len-1
        int maxX = len-1;
        //定义下边界
        //注意有边界是len-1
        int maxY = len-1;
        //只要两边边界相遇，循环停止
        while(minX <= maxX && minY <=maxY) {
            //要小于等于maxX，要访问右边界，右边界再收缩
            for (int j = minX; j <= maxX; j++) {
                arr[minY][j] = count++;
                //使用break不够优雅
                //if(count==len*len){
                // break;}
            }
            minY++;
            //同理,<=maxY要访问下边界，下边界才收缩
            for (int i = minY; i <= maxY; i++) {
                arr[i][maxX] = count++;
            }
            maxX--;
            for (int j = maxX; j >= minX; j--) {
                arr[maxY][j] = count++;
            }
            maxY--;
            for (int i = maxY; i >= minY; i--) {
                arr[i][minX] = count++;
            }
            minX++;
        }
    for (int i = 0;i<len;i++){
        for(int j = 0;j<len;j++){
            System.out.print(arr[i][j]+"\t");
        }
        System.out.println();
    }
    }
}
