package SuperAndThis.Test1;

/**
 * ClassName: CheckAccount
 * Package: SuperAndThis.Test1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 17:02
 * @Version 1.0
 */
public class CheckAccount extends Account{
    //可透支余额
    private double overDraft;

    public CheckAccount(int id,double balance,double annualInterestRate,double overDraft){
        super(id,balance,annualInterestRate);
        this.overDraft = overDraft;
    }

    public void setOverDraft(double overDraft){
        this.overDraft = overDraft;
    }

    public double getOverDraft(){
        return overDraft;
    }
    @Override
    public void withdraw(double amount){
        if(amount <= getBalance()){
            setBalance(getBalance() - amount);
            System.out.println("取钱成功，余额："+getBalance()+",可透支金额："+overDraft);
        } else {
            //大于可透支的额度
            if(amount - getBalance() > overDraft ){
                System.out.println("超过可透支的限额");
            //小于可透支的额度
            }else {
                //同时重冲减可透支金额
                overDraft -= (amount-getBalance());
                //将余额设置为0
                //注意，先冲减可透支金额，归零余额
                setBalance(0);
                System.out.println("取钱成功，余额：0,可透支金额："+overDraft);
            }
        }
    }
}
