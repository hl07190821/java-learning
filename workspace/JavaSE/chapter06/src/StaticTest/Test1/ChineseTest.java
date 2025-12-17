package StaticTest.Test1;

/**
 * ClassName: ChineseTest
 * Package: StaticTest.Usage1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 13:14
 * @Version 1.0
 */
public class ChineseTest {
    public static void main(String[] args) {
        //静态变量（类变量）在类加载时初始化，内存中只有一份
        //不需要通过对象进行调用
        Chinese.nation = "China";

        Chinese c1 = new Chinese();
        System.out.println(Chinese.nation);

        //其他所有对象的类变量都被修改
        Chinese.nation = "中华人民共和国" ;
        System.out.println(Chinese.nation);

        Chinese c2 = new Chinese();
        System.out.println(Chinese.nation);

    }
}
