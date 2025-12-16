package InheritTest.Override;

import InheritTest.Test1.Cylinder;

/**
 * ClassName: Phone
 * Package: InheritTest.Override
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 22:40
 * @Version 1.0
 */
public class Phone {
    public void sendMessage(){
        System.out.println("发短信");
    }

    public void call(){
        System.out.println("打电话");
    }

    public void showNum(){
        System.out.println("来电显示号码");
    }

    public Cylinder OverrideTest(){
        return  new Cylinder();
    }
}
