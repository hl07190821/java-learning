package TypeConversion.Test1;

/**
 * ClassName: Parent
 * Package: Constructor.Test1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/22 11:43
 * @Version 1.0
 */
public class Parent {
    public int value = 10;

    public Parent (){
        printValue();//危险调用可重写的方法
    }
    public void printValue(){
        System.out.println("Parent.printvalue():"+value);
    }
}
