package InheritTest.Override.Inherit;

/**
 * ClassName: TestCat
 * Package: InheritTest.Inherit
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 21:55
 * @Version 1.0
 */
public class TestCat {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.name = "Tom";

        cat.age = 3;

        cat.eat();

        cat.catchMouse();
        cat.catchMouse();
    }
}
