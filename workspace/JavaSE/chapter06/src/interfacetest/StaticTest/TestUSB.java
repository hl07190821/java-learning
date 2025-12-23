package interfacetest.StaticTest;

/**
 * ClassName: TestUSB
 * Package: interfacetest.StaticTest
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 19:49
 * @Version 1.0
 */
public class TestUSB {
    public static void main(String[] args) {
        //通过接口名直接调用静态方法
        USB.show();

        //通过接口名直接调用接口的静态常量
        System.out.println(USB.MAX_SPEED);
    }
}
