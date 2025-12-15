package pack1.pack3;

/**
 * ClassName: Customer
 * Package: pack1.pack3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/15 20:59
 * @Version 1.0
 */
public class Customer {
    //不用在堆中初始化
    Account account;

    String name;

    public void setName(String str){
        name = str;
    }

    public String getAcconutInfo(){

        return name+" has a account:id is "+account.getId()+",annualInterestRate is "+account.getAnnualInterestRate()+"，balance is "+account.getBalance();
    }


}
