import java.util.Arrays;

/**
 * ClassName: ArraToolsTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/12 18:55
 * @Version 1.0
 */

//数组元素拼接
class ArraysToolsTest01 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        char[] c = {'a','b','c','d'};
        boolean[] d = {true,false,false};

        String[] b = {"1","2","3"};
        String string = Arrays.toString(a);
        //直接输出数组
        System.out.println(Arrays.toString(a));
        //除了字符串都能连接
        //String string = Arrays.toString(b);
        //连接char数组
        String stringC = Arrays.toString(c);
        //连接boolean数组
        String stringD = Arrays.toString(d);

      /*  System.out.println(string);
        System.out.println(stringC);
        System.out.println(stringD);*/

    }
}

//数组排序
class ArraysToolsTest02{
    public static void main(String[] args) {
        int[] a = {3,4,6,7,3,46,7,8};
        //Arrays.sort() 将数组从小到大进行排序
        Arrays.sort(a);

        char[] b = {'a','c','d','A','D','E'};
        Arrays.sort(b);

        short[] c = {1,2,3,54,7,8};
        Arrays.sort(c);
        //Arrays.sort(int[] a,intfromIndex,int toIndex) 将数组部分进行升序排列
        Arrays.sort(a,3,5);

        String A = Arrays.toString(a);
        String B = Arrays.toString(b);

        System.out.println(A);
        System.out.println(B);

    }
}
//二分查找
class ArraysToolsTest03{
    public static void main(String[] args) {
        int[] a = {1,4,5,67,8,4,3,3};
        //Arrays.binarySearch 要求数组有序
        Arrays.sort(a);
        int index = Arrays.binarySearch(a,3);
        //若有相同的值，输出索引最小的那个
        System.out.println(index);
    }
}

//数组的复制
class ArraysToolsTest04{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        //Arrays.copyOf(int[] a ,newLength: i) length表示从左到右进行复制的长度，若超过原数组长度则设置为0
        int[] b = Arrays.copyOf(a,4);
        String B = Arrays.toString(b);
        System.out.println(B);

        int[] c = Arrays.copyOf(a,6);
        String C = Arrays.toString(c);
        System.out.println(C);

        int[] d = Arrays.copyOf(a,8);
        String D = Arrays.toString(d);
        System.out.println(D);

        //Arrays.copyOfRange(int[] a ,int from:,int to:)
        //原数组的[from , to)构成新数组，后面是索引

        int[] b1 = Arrays.copyOfRange(a,2,5);
        String B1 = Arrays.toString(b1);
        System.out.println(B1);
    }
}

//比较两个数组是否相等
class ArraysToolsTest05{
    public static void main(String[] args) {
        int[] a = {1,3,4,5,6,7};

        int[] b = {1,3,5,4,7,6};

        int[] c = {1,3,4,5,6,7};
        //Arrays.equals(int[] a,int[] b)比较两个数组的长度，每个索引对应元素是否完全相同
        boolean flag1 = Arrays.equals(a,b);
        boolean flag2 = Arrays.equals(a,c);

        System.out.println(flag1);
        System.out.println(flag2);
    }
}

//填充数组
class ArraysToolsTest06{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6};

        String A1 = Arrays.toString(a);
        System.out.println(A1);

        //Arrays.fill(a,val:) val为填充值，无返回值
        Arrays.fill(a,0);
        String A2 = Arrays.toString(a);
        System.out.println(A2);

        //Arrays.fill(a,fromIndex:,toIndex:,val:)
        //用val将数组a的[fromIndex,toIndex)进行填充
        Arrays.fill(a,1,5,4);
        String A3 = Arrays.toString(a);
        System.out.println(A3);


    }
}

