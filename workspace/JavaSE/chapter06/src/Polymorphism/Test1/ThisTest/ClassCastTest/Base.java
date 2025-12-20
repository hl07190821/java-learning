package Polymorphism.Test1.ThisTest.ClassCastTest;

/**
 * ClassName: Base
 * Package: ThisTest.ClassCastTest
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/22 11:55
 * @Version 1.0
 */
public class Base {
    public String name = "Base";
    public static String staticName = "StaticBase";

    public void instanceMethod() {
        System.out.println("Base.instanceMethod(): name = " + name);
        System.out.println("Base.instanceMethod(): this.name = " + this.name);
    }

    public static void staticMethod() {
        // 静态方法中不能使用 this
        System.out.println("Base.staticMethod(): staticName = " + staticName);
    }
}
