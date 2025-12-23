package InheritTest.StaticInherit;

/**
 * ClassName: MyInterface
 * Package: InheritTest.StaticInherit
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 21:03
 * @Version 1.0
 */
public interface MyInterface {
    static void staticMethod(){
        System.out.println("接口的静态方法");
    }

    default void defaultMethod(){
        System.out.println("接口的默认方法");
    }
}
