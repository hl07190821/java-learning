package Polymorphism.Test3;

import Polymorphism.Test1.Cat;
import Polymorphism.Test1.Dog;
import Polymorphism.Test1.Pet;

/**
 * ClassName: Petshop
 * Package: Polymorphism.Test3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 21:09
 * @Version 1.0
 */
public class PetShop {
    //返回值类型是父类类型，实际返回的是子类对象
    public Pet sale(String type){
        switch(type){
            case "Dog":
                return new Dog();
            case "Cat":
                return new Cat();
        }
        return null;
    }
}
