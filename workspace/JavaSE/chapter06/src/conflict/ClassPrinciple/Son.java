package conflict.ClassPrinciple;

/**
 * ClassName: Son
 * Package: conflict.ClassPrinciple
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 20:05
 * @Version 1.0
 */
public class Son extends Father implements Friend{
    @Override
    public void date(){
        // 报错 StackOverflowError Create breakpointer
        // date();
        /*//1，不重写默认保留父类的
        //2，调用父类被重写的
        super.date();
        //3，调用父接口的
        Friend.super.date();
        //4，完全重写
        System.out.println("跟Zoe吃饭");*/
    }
}
