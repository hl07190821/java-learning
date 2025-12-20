package abstracttest.Template;

/**
 * ClassName: TemplateMethodTest
 * Package: abstracttest.Template
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/21 23:15
 * @Version 1.0
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        BankTemplateMethod btm = new DrawMoney();
        btm.process();

        BankTemplateMethod btm2 = new ManageMoney();
        btm.process();
    }
}
