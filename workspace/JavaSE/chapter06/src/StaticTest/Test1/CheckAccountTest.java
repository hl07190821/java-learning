package StaticTest.Test1;

/**
 * ClassName: CheckAccountTest
 * Package: SuperAndThis.Test1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 17:36
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount account1 = new CheckAccount(1122,20000,0.045,5000);

        account1.withdraw(5000);

        account1.withdraw(18000);

        account1.withdraw(3000);

    }
}
