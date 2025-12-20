package Constructor.Test1;

/**
 * ClassName: Child
 * Package: Constructor.Test1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/22 11:45
 * @Version 1.0
 */
public class Child extends Parent{
    public int value = 20;//隐藏父类的value

    public Child(){
        super();
        System.out.println("Child构造器：value ="+value);
    }

    @Override
    public void printValue(){
        System.out.println("Child.printValue():"+value);//访问子类的value
    }
}
