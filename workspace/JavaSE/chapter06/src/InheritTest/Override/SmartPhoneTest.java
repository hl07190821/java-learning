package InheritTest.Override;

/**
 * ClassName: SmartPhoneTest
 * Package: InheritTest.Override
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 22:44
 * @Version 1.0
 */
public class SmartPhoneTest {
    public static void main(String[] args) {
        //创建子类对象
        SmartPhone smartPhone = new SmartPhone();

        //调用父类继承而来的方法
        smartPhone.call();
        smartPhone.showNum();
        smartPhone.sendMessage();
    }
}
