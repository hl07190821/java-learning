package Polymorphism.Test1.ThisTest.ClassCastTest;

/**
 * ClassName: ComprehensiveDemo
 * Package: ThisTest.ClassCastTest
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/22 11:57
 * @Version 1.0
 */
public class ComprehensiveDemo {
    public static void main(String[] args) {
        Derived derived = new Derived();

        System.out.println("=== 1. 实例方法调用 ===");
        derived.instanceMethod();
        // 输出:
        // Derived.instanceMethod(): name = Derived
        // Derived.instanceMethod(): this.name = Derived
        // Derived.instanceMethod(): super.name = Base

        System.out.println("\n=== 2. 通过基类引用调用 ===");
        /**
         * 多态
         * 1,父类方法被重写之后，父类的实例方法从子类的方法表"消失"
         * 2,只能通过super.实例方法()在子类内部访问父类版本
         * 3，无法通过子类对象直接调用父类的实例方法
         */
        Base baseRef = derived;
        baseRef.instanceMethod();
        // 输出:
        // Derived.instanceMethod(): name = Derived
        // Derived.instanceMethod(): this.name = Derived
        // Derived.instanceMethod(): super.name = Base

        System.out.println("\n=== 3. 字段访问（无多态） ===");
        System.out.println("derived.name: " + derived.name);          // Derived
        System.out.println("baseRef.name: " + baseRef.name);          // Base

        System.out.println("\n=== 4. 静态方法调用 ===");
        Derived.staticMethod();
        Base.staticMethod();

        System.out.println("\n=== 5. 子类内部测试 ===");
        derived.test();
    }
}
