package Polymorphism.Test1.ThisTest.Test3;

/**
 * ClassName: CustomerTest
 * Package: ThisTest.Test4
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 18:25
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("张","三");

        System.out.println(customer1.getFirstName());
        System.out.println(customer1.getLastName());
        System.out.println(customer1.getAccount());

        customer1.setAccount(new Account(1000));
        //返回的是堆中地址
        System.out.println(customer1.getAccount());
        System.out.println(customer1.getAccount().getBalance());
    }
}
