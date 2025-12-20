package SuperTest.Test2;

/**
 * ClassName: Son
 * Package: SuperTest.Order
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 16:09
 * @Version 1.0
 */
public class Son extends Father{
    int a = 20;

    public void test(int a){
        //子类与父类的属性重名，子类对象中就有两个a
        //先从局部变量找匹配
        System.out.println("局本变量的a："+a);
        //先从本类找匹配
        System.out.println("子类的a："+this.a);
        //先从父类找匹配
        System.out.println("父类的a："+super.a);

        //子类与父类的属性不同名，是同一个b
        System.out.println("父类的b："+b);
        System.out.println("父类的b："+this.b);
        System.out.println("父类的b："+super.b);


    }
}
