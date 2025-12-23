package InnerClass.MemberInnerClass;

/**
 * ClassName: TestMemberInnerClass
 * Package: InnerClass.MemberInnerClass
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 22:06
 * @Version 1.0
 */
public class TestMemberInnerClass {
    public static void main(String[] args) {
        //创建静态内部类实例，并调用方法
       Outer.StaticInner inner = new Outer.StaticInner();
       inner.inFun();
       //调用静态内部类的静态方法
       Outer.StaticInner.inMethod();

        System.out.println("**********************************");

        //创建非静态内部类实例（方式1），并调用方法
        //得先创建外部类实例
        Outer outer = new Outer();
        Outer.NoStaticInner inner1 = outer.new NoStaticInner();
        //内部类实例.非静态方法
        inner1.inFun();
        //调用非静态内部类的静态方法
        //与静态内部类相似
        Outer.NoStaticInner.inMethod();

        //创建非静态内部类实例（方式2）
        Outer.NoStaticInner inner2 = outer.getNoStaticInner();
        inner2.inFun();
    }
}
