package interfacetest.polymorphism;

/**
 * ClassName: TestComputer
 * Package: interfacetest.polymorphism
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/22 13:24
 * @Version 1.0
 */
public class TestComputer {
    public static void main(String[] args) {
        USB usb = new Mouse();
        Mouse mouse =  new Mouse();
        //报错,接口不能创建实例对象
        //但是可以创建匿名实例对象
        // USB usb = new USB();
        //多态只关注右边的类
        Computer.show(mouse);
        Computer.show(usb);
        usb.in();
        usb.out();

        usb = new KeyBoard();
        Computer.show(usb);
        usb.in();
        usb.out();


    }
}
