package InheritTest.Inherit;

/**
 * ClassName: Animal
 * Package: InheritTest.Inherit
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 21:52
 * @Version 1.0
 */
public class Animal {
    //定义name属性
    String name;

    //定义age属性
    int age;

    //定义动物的吃东西方法
    public void eat(){
        System.out.println(age + "岁的" + name + "在吃东西");
    }
}
