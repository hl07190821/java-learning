package interfacetest.StaticTest;

/**
 * ClassName: TestMobileHDD
 * Package: interfacetest.StaticTest
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 19:47
 * @Version 1.0
 */
public class TestMobileHDD {
    public static void main(String[] args) {
        //创建实现类对象
        USB usb = new UsbAchieve();
        usb.print();
        //静态方法不能通过实例调用
        //usb.show;
        USB.show();
        UsbAchieve.show();

        //静态常量一并传给实现类
        System.out.println(UsbAchieve.MAX_SPEED);

    }
}
