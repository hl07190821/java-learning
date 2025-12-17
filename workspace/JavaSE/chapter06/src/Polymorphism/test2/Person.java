package Polymorphism.test2;

import Polymorphism.Test1.Pet;

/**
 * ClassName: Person
 * Package: Polymorphism.test2
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 21:03
 * @Version 1.0
 */
public class Person {
    private Pet pet;

    public void adopt(Pet pet){//形参是父类类型，实参是子类对象
        this.pet = pet;
    }

    public void feed(){
        pet.eat();//pet实际引用的对象类型不同，执行的eat方法也不同
    }
}
