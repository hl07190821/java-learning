package InheritTest.StaticInherit;

/**
 * ClassName: TestChild
 * Package: InheritTest.StaticInherit
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 21:01
 * @Version 1.0
 */
public class TestChild {
    public static void main(String[] args) {
        Parent.staticMethod();
        //子类可以通过类名调用父类的静态方法
        //但是实现类不能通过类名调用父接口的静态方法
        Child.staticMethod();

        //实例方法才是真正的继承
        Child child = new Child();
        child.instanceMethod();
    }
}
