package StaticTest.Test2;

/**
 * ClassName: StaticTest
 * Package: StaticTest.Order
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 14:40
 * @Version 1.0
 */
public class StaticTest {
    public static void main(String[] args) {
        Demo test = null;
        //编译期绑：当编译器看到test.hello()时，它首先检查hello()方法，如果hello()
        //是静态方法，编译器会立即忽略test这个应用变量本身（不管它是null还是指向某个对象）
        //直接将这行代码绑定到demo类的hello（）方法上，在编译生成的字节码中，test.hello()本质上
        //就被翻译成了Demo.hello()
        Demo.hello();

        Demo.hello();
    }
}
