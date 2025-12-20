package StaticTest.Test2;

/**
 * ClassName: Father
 * Package: StaticTest.Order
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 14:03
 * @Version 1.0
 */


public class Father {
    //公开的静态方法定义了类对外提供的服务契约
    //私有的静态方法封装了实现这些契约所需的内部算法和步骤
    public static void fun(){
        System.out.println("Father.fun");
    }

    public void funTest(){
        System.out.println("Father.funTest");
    }
}
