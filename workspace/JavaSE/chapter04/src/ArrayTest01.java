import java.util.Scanner;

/**
 * ClassName: ArrayTest01
 * Package: PACKAGE_NAME
 * Description:
 * 数组元素下标可以是整型常量或者“整形表达式”
 * @Author Soon
 * @Create 2025/12/10 19:22
 * @Version 1.0
 */

//数组元素的引用
class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,};

        System.out.println("arr数组的长度："+arr.length);
        System.out.println("arr数组第一个元素："+arr[0]);
        System.out.println("arr数组第二个元素："+arr[1]);
        System.out.println("arr数组第三个元素："+arr[2]);
        System.out.println("arr数组第四个元素："+arr[3]);
        System.out.println("arr数组第五个元素："+arr[4]);

        //修改第一个元素
        arr[0] = 100;
        System.out.println("arr数组的第一个元素是："+arr[0]);
    }
}

//一维数组的遍历
class ArrayTest02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int arrayLength = arr.length;
        //使用for循环遍历数组
        //注意：数组长度减一，否则会报错ArrayIndexOutOfBoundsException 数组索引越界
        for (int i = 0;i <= arrayLength-1;i++){
            System.out.println("arr数组的第"+(i+1)+"个元素是："+arr[i]);
        }
    }
}

//数组元素的默认值
class ArrayTest03 {
    public static void main(String[] args) {
        byte[] arr1 = new byte[5];
        System.out.println(arr1[3]);

        short[] arr2 = new short[5];
        System.out.println(arr2[3]);

        int[] arr3 = new int[5];
        System.out.println(arr3[3]);

        long[] arr4 = new long[5];
        System.out.println(arr4[3]);

        float[] arr5 = new float[5];
        System.out.println(arr5[3]);

        double[] arr6 = new double[5];
        System.out.println(arr6[3]);

        char[] arr7 = new char[5];
        System.out.println(arr7[3]);

        boolean[] arr8 = new boolean[5];
        System.out.println(arr8[3]);
    }
}

//两个引用数据类型变量指向一个一维数组
class ArrayTest04 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i = 0;i <= arr.length-1;i++){
            arr[i] = i;
        }
        System.out.println("数组内存首地址："+arr);
        System.out.println("数组第三个元素为："+arr[2]);
        int[] arr2 = arr;

        System.out.println("数组内存首地址："+arr2);
        arr2[2] = 33;
        System.out.println("数组第三个元素为："+arr[2]);
    }
}

//存储电话号码
class ArrayTest05 {
    public static void main(String[] args) {
        //房价号
        int[] arr = new int[5];

        //存储一串电话号码
        //String用于输出
        String tel = "";
        //电话号码按照数字一个一个存储在数组中
        int[] num = new int[]{1,5,9,0,8,1,0,3,9,1,9};


        for (int i = 0;i< num.length;i++){
            tel += num[i];
        }
        System.out.println("电话号码为："+tel);
    }
}

//用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
class ArrayTest06{
    public static void main(String[] args) {
        //声明存储英语单词的数组
        String[] date = new String[]{"Monday","Tuesday","Wensday","Thuresday","Friday","Saturday","Sunday"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入周一到周日的阿拉伯数字：");
        int num = scanner.nextInt();

        System.out.println("这一天的英语单词是："+date[num-1]);
    }
}

//从键盘读入学生成绩，找出最高分，并输出学生成绩等级
class ArrayTest07{
    public static void main(String[] args) {
        //接受学生人数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int studentNum = scanner.nextInt();

        //创建数组存储成绩
        int[]score = new int[studentNum];

        //记录最高分
        int maxScore = 0;

        //初始化数组
        for(int i = 0;i<studentNum;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩:");
            score[i] = scanner.nextInt();
            if(score[i] > maxScore){
                //找出最高分
                maxScore = score[i];
            }
        }

        //注意，这里不用排序，最高分依次减十依次减少等级
        for (int i = 0;i<studentNum;i++){
            if(score[i]<=maxScore&&score[i]>maxScore-10){
                System.out.println("student "+i+" is "+score[i]+",grade is A");
            } else if (score[i]<=maxScore-10&&score[i]>maxScore-20) {
                System.out.println("student "+i+" is "+score[i]+",grade is B");
            } else if (score[i]<=maxScore-20&&score[i]>maxScore-30) {
                System.out.println("student "+i+" is "+score[i]+",grade is C");
            }else {
                System.out.println("student "+i+" is "+score[i]+",grade is D");
            }
        }


    }
}
