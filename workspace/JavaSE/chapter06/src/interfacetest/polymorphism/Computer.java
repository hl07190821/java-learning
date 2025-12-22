package interfacetest.polymorphism;

/**
 * ClassName: Computer
 * Package: interfacetest.polymorphism
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/22 13:25
 * @Version 1.0
 */
public class Computer {
    public static void show(USB usb){
        usb.out();
        System.out.println("-------------USB 设备工作 ------------");
        usb.in();
    }
}

