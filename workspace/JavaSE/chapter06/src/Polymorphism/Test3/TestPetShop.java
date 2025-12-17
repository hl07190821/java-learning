package Polymorphism.Test3;

import Polymorphism.Test1.Pet;

/**
 * ClassName: TestPetShop
 * Package: Polymorphism.Test3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 21:13
 * @Version 1.0
 */
public class TestPetShop {
    public static void main(String[] args) {
        PetShop petShop = new PetShop();

        Pet dog = petShop.sale("Dog");
        dog.setNickname("小黑");
        dog.eat();

        Pet cat = petShop.sale("Cat");
        cat.setNickname("小白");
        cat.eat();
    }
}
