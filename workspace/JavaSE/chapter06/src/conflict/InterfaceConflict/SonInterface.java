package conflict.InterfaceConflict;

import conflict.ClassPrinciple.Friend;

/**
 * ClassName: SonInterface
 * Package: conflict.InterfaceConflict
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 20:19
 * @Version 1.0
 */
public interface SonInterface extends Friend,BoyFriend{
    //接口与实现类相同
    //不进行重写将会报错
    @Override
    default void date(){
        //这里会报错，BoyFriend.super.date();
        System.out.println("Zoe eats dinner");
    }
}
