package SuperAndThis.Test1;

/**
 * ClassName: Account
 * Package: SuperAndThis.Test1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 16:51
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    //返回月利率
    public double getMonthlyInterest(){
        return annualInterestRate/12;
    }

    //存款
    public void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
            System.out.println("存款成功，剩余金额为："+balance);
        }else {
            System.out.println("输入金额不合法！");
        }
    }

    //取款
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            this.balance -= amount;
            System.out.println("取款成功，剩余金额为："+balance);
        }else if(amount <= 0){
            System.out.println("输入不合法！");
        }else {
            System.out.println("余额不足！");
        }
    }
}
