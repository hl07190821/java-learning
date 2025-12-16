package ThisTest.Test3;

/**
 * ClassName: AccountTest
 * Package: ThisTest.Test3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 18:15
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        a1.withdraw(2000);
        System.out.println(a1.getBalance());
        a1.deposit(1000);
        System.out.println(a1.getBalance());
        a1.withdraw(2000);
        System.out.println(a1.getBalance());
    }
}
