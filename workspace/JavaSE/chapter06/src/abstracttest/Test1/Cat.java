package abstracttest.Test1;

/**
 * ClassName: Cat
 * Package: abstracttest.Test1
 * Description:
 * 此时的方法重写，是子类对父类抽象方法的完成实现，我们将这种方法重写的操作，也叫做实现方法
 * @Author Soon
 * @Create 2025/12/21 22:42
 * @Version 1.0
 */
public class Cat extends Animal{
    public void eat(){
        System.out.println("小猫吃鱼和猫粮");
    }
}
