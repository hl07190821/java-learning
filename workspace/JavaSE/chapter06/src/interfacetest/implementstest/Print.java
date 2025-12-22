package interfacetest.implementstest;

/**
 * ClassName: Print
 * Package: interfacetest.implementstest
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/22 12:45
 * @Version 1.0
 */
public class Print implements USB{
    @Override
    public void start(){
        System.out.println("打印机开始工作。");
    }

    @Override
    public void stop(){
        System.out.println("打印机停止工作。");
    }
}
