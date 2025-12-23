package InnerClass.LocalInnerClass;

/**
 * ClassName: TestLocalInner
 * Package: InnerClass.LocalInnerClass
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 22:48
 * @Version 1.0
 */
public class TestLocalInner {
    public static void main(String[] args) {
        Outer.outMethod();
        System.out.println("-------------------");

        //调用成员方法
        Outer out = new Outer();
        out.outTest();
        System.out.println("--------------------");

        Runner runner = Outer.getRunner();
        runner.run();
    }
    }
