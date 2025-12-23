package conflict.ConstantConflict;

/**
 * ClassName: SubClass
 * Package: conflict.ConstantConflict
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 20:26
 * @Version 1.0
 */
public class SubClass extends SuperClass implements SuperInterface,MotherInterface{
    //静态常量的继承
    public void method(){

        //不知道是哪个x，System.out.println("x = "+ x);
        System.out.println("super.x = "+super.x);

        System.out.println("SuperInterface.x "+SuperInterface.x);

        System.out.println("MotherInterface.x "+MotherInterface.x);
        //y没有重名问题，可以直接访问
        System.out.println("y = "+y);
    }
}
