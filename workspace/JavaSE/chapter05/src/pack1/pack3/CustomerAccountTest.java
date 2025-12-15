package pack1.pack3;

/**
 * ClassName: CustomerAccountTest
 * Package: pack1.pack3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/15 21:04
 * @Version 1.0
 */
public class CustomerAccountTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setName("Jane Smith");
        //报错，Account customer1.account = new Account();因为引用变量已经初始化了，不用再进行声明，只是在堆中缺少一个有意义的可以指向的地址
        customer1.account = new Account("1000",2000,0.0123);
        customer1.account.deposit(100);
        customer1.account.withDraw(960);
        customer1.account.withDraw(2000);
        System.out.println(customer1.getAcconutInfo());

    }
}
