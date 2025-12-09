/**
 * ClassName: ArrayTest
 * Package: JavaSE
 * Description:
 * 数组本身是引用数据类型，而数组中的元素可以是任何数据类型，摆阔基本数据类型和引用数据类型；
 * 创建数组对象会在内存中开辟一整块连续的空间；
 * 数组一旦初始化完成，其长度就是确定的，数组的长度一旦确定就不能修改；
 * 数组名中引用的是这块连续空间的首地址
 * @Author Soon
 * @Create 2025/12/10 19:02
 * @Version 1.0
 */

public class ArrayTest {
    public static void main(String[] args) {
        //静态初始化
        int[] arr;
        //分两个语句进行声明和初始化，必须要加new int
        arr = new int[]{1,2,3,4,5,};
        //使用一个语句进行声明和初始化，不用加new int
        int[] arr1 = {1,2,3,4,5};

        //动态初始化
        int[] arr2 = new int[5];

        int[] arr3;
        arr3 = new int[5];

        //错误写法
        //int[] arr4 = new int[5]{1,2,3,4,5};
    }
}
