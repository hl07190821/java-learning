package StaticTest.Test5;

/**
 * ClassName: OrderTest
 * Package: StaticTest.Test5
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 16:16
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        //执行顺序为 静态代码块 非静态代码块 构造器 与在类中的顺序无关
        StaticCodeBlock order = new StaticCodeBlock("张三");
        /**
         * 静态代码块初始化，country = 中国
         * 非静态代码块初始化，country = Chinese
         * 构造器初始化，country = China
         */
    }
}
