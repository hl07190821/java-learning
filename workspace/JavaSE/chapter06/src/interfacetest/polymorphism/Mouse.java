package interfacetest.polymorphism;

/**
 * ClassName: Mouse
 * Package: interfacetest.polymorphism
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/22 13:21
 * @Version 1.0
 */
public class Mouse implements USB {
    @Override
    public void out() {
        System.out.println("发送脉冲信号");
    }

    @Override
    public void in() {
        System.out.println("不接收信号");
    }
}
