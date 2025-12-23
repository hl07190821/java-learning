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
        //接口静态方法不能被继承
        //usb.show;
        USB.show();
        //此处调用的是UsbAchieve的静态方法
        UsbAchieve.show();

        //静态常量一并传给实现类
        System.out.println(UsbAchieve.MAX_SPEED);

    }
}
