package interfacetest.implementstest;

/**
 * ClassName: Computer
 * Package: interfacetest.implementstest
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/22 12:42
 * @Version 1.0
 */
public class Computer {
    public static void show(USB usb){
        usb.start();
        System.out.println("-------------USB 设备工作 ------------");
        usb.stop();
    }
}
