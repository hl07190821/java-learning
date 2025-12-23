package InheritTest.StaticInherit;

/**
 * ClassName: TestSonInterface
 * Package: InheritTest.StaticInherit
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 21:07
 * @Version 1.0
 */
public class TestSonInterface {
    public static void main(String[] args) {
        MyInterface.staticMethod();
        //子接口同样无法通过接口名调用父接口的静态方法
        //SonInterface.staticMethod();
    }
}
