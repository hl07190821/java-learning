package Polymorphism.test2;

import Polymorphism.Test1.Cat;
import Polymorphism.Test1.Dog;

/**
 * ClassName: TestPerson
 * Package: Polymorphism.test2
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 21:05
 * @Version 1.0
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();

        Dog dog = new Dog();
        dog.setNickname("小白");
        person.adopt(dog);//实参是dog子类对象，形参是父类pet类型
        person.feed();//调用的pet中被dog重写的eat方法

        Cat cat = new Cat();
        cat.setNickname("雪球");
        person.adopt(cat);
        person.feed();
    }
}
