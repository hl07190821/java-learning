package interfacetest.StaticTest;

/**
 * ClassName: UsbAchieve
 * Package: interfacetest.StaticTest
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 19:54
 * @Version 1.0
 */
public class UsbAchieve implements USB{

    @Override
    public void print() {
        System.out.println("Zoe BAD");
    }

    public static void show(){
        System.out.println("Zoe LOVE UsbAchieve");
    }
}
