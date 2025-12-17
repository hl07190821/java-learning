package ThisTest.ClassCastTest;

/**
 * ClassName: TestInstanceof
 * Package: TypeConversion.ClassCastTest
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 21:58
 * @Version 1.0
 */

import Polymorphism.Test1.Cat;
import Polymorphism.Test1.Dog;
import Polymorphism.Test1.Pet;

/**
 * 说明：
 * a instanceof A
 * 只要用instanceof判断返回true的，那么强转为该类型就一定是安全的，不会报ClassCastException异常
 * 要求对象a所属的类与类A必须是子类和父类的关系，否贼编译错误
 */
public class TestInstanceof {
    public static void main(String[] args) {
        Pet[] pets = new Pet[2];
        pets[0] = new Dog();
        pets[1] = new Cat();

        pets[0].setNickname("小黑");
        pets[1].setNickname("雪球");

        for (int i = 0; i < pets.length;i++){
            pets[i].eat();
            if (pets[i] instanceof Dog){
                //开一扇窗户
                Dog dog = (Dog) pets[i];
                dog.watchHouse();
            }else if(pets[i] instanceof Cat){
                Cat cat = (Cat) pets[i];
                cat.catchMouse();
            }
        }
    }
}
