package Polymorphism.Test1;

/**
 * ClassName: PetTest
 * Package: Polymorphism.Test1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 20:40
 * @Version 1.0
 */
public class PetTest {
    public static void main(String[] args) {
        //多态引用
        Pet pet = new Dog();
        pet.setNickname("小白");

        //多态的表现形式
        /**
         * 编译时看父类。只能调用父类声明的方法，不能调用子类扩展的方法
         * 运行时看子类，如果子类重写了方法，一定是执行子类重写的方法体/。
         */
        pet.eat();//运行时执行子类Dog重写的方法
        //pet.watchHouse();//不能调用Dog子类扩展的方法


        pet = new Cat();
        pet.setNickname("雪球");
        pet.eat();
    }
}
