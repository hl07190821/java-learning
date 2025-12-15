package pack1.pack3;

/**
 * ClassName: Account
 * Package: pack1.pack3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/15 20:46
 * @Version 1.0
 */
public class Account {
    private String id;
    private int balance;
    private double annualInterestRate;
    //无参构造，改变默认值
    public Account(){
        id = "0000";
        balance = 0;
        annualInterestRate = 0.001;
    }
    //有参构造
    public Account(String str,int i,double d){
        id = str;
        balance = i;
        annualInterestRate = d;
    }

    public void setId(String str){
        id = str;
    }

    public void setBalance(int num){
        balance = num;
    }

    public void setAnnualInterestRate(double d){
        annualInterestRate = d;
    }

    public String getId(){
        return id;
    }

    public int getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    //取钱，余额不足无法取钱
    public void withDraw(int withDrawMoney){
        if(balance >= withDrawMoney){
            balance -= withDrawMoney;
            System.out.println("您的账户剩余："+balance+"元");
        }else {
            System.out.println("金额不足，无法取款");
        }
    }
    //存钱
    public void deposit(int depositMoney){
        balance += depositMoney;
        System.out.println("存款成功！您的账务余额为："+balance+"元");
    }
}
