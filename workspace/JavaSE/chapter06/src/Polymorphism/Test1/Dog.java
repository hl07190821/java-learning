package Polymorphism.Test1;

/**
 * ClassName: Dog
 * Package: Polymorphism.Test1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 20:38
 * @Version 1.0
 */
public class Dog extends Pet{
    @Override
    public void eat(){
        System.out.println("狗子" + getNickname() + "啃骨头");
    }

    //子类扩展的办法
    public void watchHouse(){
        System.out.println("看家");
    }
}
