package ThisTest.Test3;

/**
 * ClassName: Account
 * Package: ThisTest.Test3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 18:10
 * @Version 1.0
 */
public class Account {
    private double balance;

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }
    //有参构造器，初始化balance
    public Account(double init_balance){
        this.balance = init_balance;
    }

    public void deposit(double amt){
        this.balance += amt;
        System.out.println("您的余额为："+this.balance);
    }

    public void withdraw(double amt){
        if(this.balance >= amt){
            this.balance -= amt;
        }else{
            System.out.println("余额不足");
        }
    }
}
