package Polymorphism.Test1.ThisTest.Test3;

/**
 * ClassName: Customer
 * Package: ThisTest.Test4
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 18:18
 * @Version 1.0
 */
public class Customer {
    private final String firstName;
    private final String lastName;
    Account account;

    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //初始化账户，余额为0
        //爆错，堆中还没有声明account，this.account.deposit(0);
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public Account getAccount(){
        return this.account;
    }

    public void setAccount(Account account){
        this.account = account;
    }
}
