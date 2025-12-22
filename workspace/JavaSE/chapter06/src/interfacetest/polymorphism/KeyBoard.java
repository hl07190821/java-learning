package interfacetest.polymorphism;

/**
 * ClassName: KeyBoard
 * Package: interfacetest.polymorphism
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/22 13:23
 * @Version 1.0
 */
public class KeyBoard implements USB{
    @Override
    public void in() {
        System.out.println("不接收信号");
    }

    @Override
    public void out() {
        System.out.println("发送按键信号");
    }
}
