package Polymorphism.Test1;

/**
 * ClassName: Cat
 * Package: Polymorphism.Test1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 20:36
 * @Version 1.0
 */
public class Cat extends Pet{
    //子类重写父类的方法
    @Override
    public void eat(){
        System.out.println("猫咪" + getNickname() + "吃鱼籽");
    }

    //子类扩展的方法
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
