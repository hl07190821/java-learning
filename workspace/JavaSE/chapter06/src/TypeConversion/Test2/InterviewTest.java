package TypeConversion.Test2;

/**
 * ClassName: InterviewTest
 * Package: TypeConversion.Order
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/18 11:39
 * @Version 1.0
 */

/**
 * int... 可以兼容int[]
 * 但是int[]不可以兼容int...
 *
 */
public class InterviewTest {

    public static void main(String[] args) {
        Base base = new Sub();
        //通过base引用调用可以传数组或可变参数
        base.add(1,2,3);
        base.add(1,new int[2]);



        //通过base引用调用只能传数组
        //base.sum(1,2,3);
        base.sum(1,new int[2]);
    }
}
