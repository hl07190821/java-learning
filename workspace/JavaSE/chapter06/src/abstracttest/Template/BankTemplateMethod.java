package abstracttest.Template;

/**
 * ClassName: BankTemplateMethod
 * Package: abstracttest.Template
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/21 23:09
 * @Version 1.0
 */
public abstract class BankTemplateMethod {
    //具体方法
    public void takenumber(){
        System.out.println("取号排队");
    }

    public abstract void transact();//办理具体的业务，钩子方法

    public void evaluate(){
        System.out.println("反馈评分");
    }

    //模板方法，把基本操作组合到一起，子类一般不能重写
    public final void process(){
        this.takenumber();

        this.transact();//像个钩子，具体执行时，挂哪个子类，就执行哪个子类的实现代码

        this.evaluate();
    }
}
