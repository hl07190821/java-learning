package InheritTest.Override;

import InheritTest.Test1.Cylinder;

/**
 * ClassName: SmartPhone
 * Package: InheritTest.Override
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 22:42
 * @Version 1.0
 */
public class SmartPhone extends Phone{
    @Override//重写父类的”方法“
    public void showNum(){
        System.out.println("显示来电姓名");
        System.out.println("显示头像");
    }

    @Override
    public void call() {
        System.out.println("语音童话 或 视频通话");
    }

    //private void call(){} 权限范围不能小于public

    @Override
    public Cylinder OverrideTest(){
        //Cylinder比Circle小
        return  new Cylinder();
    }
}
