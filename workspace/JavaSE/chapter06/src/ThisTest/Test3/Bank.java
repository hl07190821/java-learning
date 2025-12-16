package ThisTest.Test3;

/**
 * ClassName: Bank
 * Package: ThisTest.Test3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 18:28
 * @Version 1.0
 */

public class Bank {

//使用对象的类成员变量之前，要先在堆中声明类

    private final Customer[] customers;

    private int numberOfCustomer;

//私有化构造器

    private Bank() {

        this.numberOfCustomer = 0;

        customers = new Customer[100];

    }

    private static final Bank bank = new Bank();

//读取银行类

    public static Bank getBank() {

//在静态方法中不能使用this关键词

//return this.bank;

        return bank;

    }

//这里不能static

//添加客户的信息

    public void addCustomer(Customer customer) {

        if (numberOfCustomer <= 99) {

            customers[numberOfCustomer++] = customer;

        } else {

            System.out.println("银行已经达到最大存储人数");

        }

    }

//读取客户的信息

//防止数组越界风险

    public Customer getCustomer(int num) {

        if (num <= numberOfCustomer && num >= 0) {

            return customers[num];

        } else {

            System.out.println("输入不合法");

            return new Customer("张", "三");

        }

    }

//读取人数

    public int getNumberOfCustomer() {

        return this.numberOfCustomer;

    }
}
/*//全静态类
public class Bank {
    //使用对象的类成员变量之前，要先在堆中声明类
    private static Customer[] customers = new Customer[100];
    private static int numberOfCustomer;


    //私有化构造器
    private Bank(){
        this.numberOfCustomer = 0;
        customers = new Customer[100];
    }

    //这里不能static
    //添加客户的信息
    public static void addCustomer(Customer customer){
        if(numberOfCustomer<=99) {
            customers[numberOfCustomer++] = customer;
        }else{
            System.out.println("银行已经达到最大存储人数");
        }
    }

    //读取客户的信息
    //防止数组越界风险
    public static Customer getCustomer(int num){
        if(num <= numberOfCustomer && num>=0){
        return customers[num];
        }else {
            System.out.println("输入不合法");
            return new Customer("张","三");
        }
    }

    //读取人数
    public static int getNumberOfCustomer(){
        return  numberOfCustomer;
    }

}*/

