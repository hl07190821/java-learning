package StaticTest.Test2;

/**
 * ClassName: Son
 * Package: StaticTest.Order
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 14:10
 * @Version 1.0
 */
public class Son extends Father {
    //@Override 重写static方法不叫重写，而是叫做隐藏
    public static void fun(){
        System.out.println("Son.fun");
    }

    //重写实例方法才叫做重写
    @Override
    public void funTest(){
        System.out.println("Son.funTest");
    }
}
