package conflict.ClassPrinciple;

/**
 * ClassName: Friend
 * Package: conflict.ClassPrinciple
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 20:04
 * @Version 1.0
 */
public interface Friend {
    //default是功能修饰符
    //提供方法的默认实现
    //1，它是一个有具体实现的方法
    //2，实现该接口的类可以继承并使用这个默认实现，也可以选择重写它
    //3，它本身隐含着public访问权限
    default void date(){
        System.out.println("吃喝玩乐");
    }
}
