package Polymorphism.Test1.ThisTest.ClassCastTest;

/**
 * ClassName: Derived
 * Package: ThisTest.ClassCastTest
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/22 11:56
 * @Version 1.0
 */
public class Derived extends Base{
    public String name = "Derived";  // 隐藏基类的实例字段
    public static String staticName = "StaticDerived";  // 隐藏基类的静态字段

    @Override
    public void instanceMethod() {
        System.out.println("Derived.instanceMethod(): name = " + name);
        System.out.println("Derived.instanceMethod(): this.name = " + this.name);
        System.out.println("Derived.instanceMethod(): super.name = " + super.name);
    }

    public static void staticMethod() {
        System.out.println("Derived.staticMethod(): staticName = " + staticName);
        System.out.println("Derived.staticMethod(): Base.staticName = " + Base.staticName);
    }
    public void test() {
        System.out.println("\n=== 测试各种访问方式 ===");

        // 直接访问
        System.out.println("直接访问 name: " + name);                    // Derived

        // 通过this访问
        System.out.println("this.name: " + this.name);                  // Derived

        // 通过super访问
        System.out.println("super.name: " + super.name);                // Base

        // 强制类型转换访问
        System.out.println("((Base)this).name: " + ((Base)this).name);  // Base

        // 静态字段
        System.out.println("staticName: " + staticName);                // StaticDerived
        System.out.println("Base.staticName: " + Base.staticName);      // StaticBase
    }
}
