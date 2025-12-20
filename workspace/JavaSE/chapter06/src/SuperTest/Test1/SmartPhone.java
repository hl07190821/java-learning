package SuperTest.Test1;

/**
 * ClassName: SmartPhone
 * Package: SuperTest.User
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 15:59
 * @Version 1.0
 */
public class SmartPhone extends Phone {
    @Override
    public void showNum(){
        System.out.println("显示来电姓名");
        System.out.println("显示头像");

        //此处必须加super，否则就是无限递归，那么就会栈内存溢出
        //调用父类来电显示号码的功能
        super.showNum();
    }
}
