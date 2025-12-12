/**
 * ClassName: NullPointerExceptionTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/12 19:38
 * @Version 1.0
 */
//空指针异常
class NullPointerExceptionTest01 {
    public static void main(String[] args) {
        //定义数组
        int[][] arr = new int[3][];

        System.out.println(arr[0][0]);
        //NullPointerException，此时每一行还未分配具体存储元素的空间，因此显示空指针异常
    }
}
//空指针异常情况总结
class NullPointerExceptionTest02{
    public static void main(String[] args) {
        int[] arr = new int[10];

     /*   //举例一
        arr = null;
        //报错
        //arr[9] = null;
        System.out.println(arr[9]);
*/
   /*     //举例二
        int[][] arr2 = new int[5][];
        System.out.println(arr2[2][3]);
*/
        //举例三
        String[] arr3 = new String[10];
        System.out.println(arr3[2]);
        System.out.println(arr3[2].toString());
        //println方法实现的逻辑：
        // PrintStream 类中的 println() 简化版逻辑
        /*public void println(Object obj) {
            if (obj == null) {
                print("null");  // ✅ 特殊处理 null 值
            } else {
                print(obj.toString());  // ✅ 非 null 时才调用 toString()
            }
        }*/

    }
}
