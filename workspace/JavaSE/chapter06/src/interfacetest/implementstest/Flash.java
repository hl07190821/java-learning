package interfacetest.implementstest;

/**
 * ClassName: Flash
 * Package: interfacetest.implementstest
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/22 12:44
 * @Version 1.0
 */
public class Flash implements USB{
    //重写抽象方法
    @Override
    public void start(){
        System.out.println("U盘开始工作。");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}
