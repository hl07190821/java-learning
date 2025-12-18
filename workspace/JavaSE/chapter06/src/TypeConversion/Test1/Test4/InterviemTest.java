package TypeConversion.Test1.Test4;

import java.util.Random;

/**
 * ClassName: InterviemTest
 * Package: TypeConversion.Test4
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/18 16:23
 * @Version 1.0
 */
/**
 * 1,随机key值
 * key通过new Random().nextInt(3)生成，是运行时行为
 * 编译器在编译阶段无法预测key的具体值，因此无法知道getInstanc（）会返回哪个子类实例
 * 这直接证明：编译时无法确定调用哪个子类的eat（）方法
 * 2，方法调用的动绑定
 *编译时，编译器只绑定到父类的Animal。eat（）方法
 * 运行时，JVM通过动态绑定机制，根据对象类型找到并执行对应的子类方法
 * 这种编译时绑定父类方法，运行时执行子类实现的特性，正是多态的核心
 * 也是其作为运行时行为的直接证据
 */

public class InterviemTest {
    //返回Animal类型

    public static Animal getInstance(int key) {
        switch(key) {
            case 0:
                return new Cat();
            case 1:
                return new Dog();
            default:
                return new Sheep();
        }
    }

    public static void main(String[] args){
        int key = new Random().nextInt(3);
        System.out.println(key);

        Animal animal = getInstance(key);
        animal.eat();
    }
}
