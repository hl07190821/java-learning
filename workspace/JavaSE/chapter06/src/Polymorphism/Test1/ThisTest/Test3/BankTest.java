package Polymorphism.Test1.ThisTest.Test3;

/**
 * ClassName: BankTest
 * Package: ThisTest.Test3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 18:58
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        //通过静态工厂方法获取bank的唯一实例
        //这里可以看出getBank（）方法必须是static不然无法访问唯一实例bank
        Bank bank = Bank.getBank();
        //在银行开户
        bank.addCustomer(new Customer("张","三"));

        bank.getCustomer(0).setAccount(new Account(1000));

    }
}
