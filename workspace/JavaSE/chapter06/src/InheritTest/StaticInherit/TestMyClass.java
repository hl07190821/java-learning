package InheritTest.StaticInherit;

/**
 * ClassName: TestMyClass
 * Package: InheritTest.StaticInherit
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 21:05
 * @Version 1.0
 */
public class TestMyClass {
    public static void main(String[] args) {
        MyInterface.staticMethod();
        //不能通过类名调用父接口的静态方法
        //MyClass.staticMethod();

        MyClass myClass = new MyClass();
        myClass.defaultMethod();
    }
}
