package conflict.InterfaceConflict;

import conflict.ClassPrinciple.Friend;

/**
 * ClassName: Girl
 * Package: conflict.InterfaceConflict
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 20:14
 * @Version 1.0
 */
public class Girl implements Friend,BoyFriend {
    //若两个接口中有同名的方法
    //在实现类继承这两个接口的时候
    //若不进行重写，将会报错
    @Override
    public void date(){
        //1，保留其中一个父接口的
//        Friend.super.date();
//        BoyFriend.super.date();
        //2，完全重写
        System.out.println("跟Zoe去吃饭");
    }
}
