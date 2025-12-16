package InheritTest.Inherit;

/**
 * ClassName: Cat
 * Package: InheritTest.Inherit
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 21:53
 * @Version 1.0
 */
public class Cat extends Animal{
    //记录每只猫抓的老鼠数量
    int count;

    //定义一个猫抓老鼠的方法catchMouse
    public void catchMouse(){
        count++;
        System.out.println("抓老鼠，已经抓了" + count + "只老鼠");

    }
}
