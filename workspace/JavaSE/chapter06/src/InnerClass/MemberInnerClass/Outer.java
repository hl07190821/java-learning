package InnerClass.MemberInnerClass;

/**
 * ClassName: Outer
 * Package: InnerClass.MemberInnerClass
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 22:07
 * @Version 1.0
 */
public class Outer {
    private static final String a = "外部类的静态a";
    private static final String b = "外部类的静态b";
    private final String c = "外部类对象的非静态c";
    private final String d = "外部类对象的非静态d";

    //定义静态内部类
    static class StaticInner{
        private static final String a = "静态内部类的静态a";
        private final String c = "静态内部类对象的非静态c";
        public static void inMethod(){

            //内部类的静态成员将同名的外部类的静态成员覆盖
            System.out.println("Inner.a = "+a);
            //Outer.a访问外部类的静态成员
            System.out.println("Outer.a = "+Outer.a);
            System.out.println("b = "+b);
        }

        public void inFun(){
            System.out.println("Inner.inFun");
            System.out.println("Outer.a = "+Outer.a);
            System.out.println("Inner.a = "+ a);
            System.out.println("b = "+b);
            //静态内部类的非静态成员将外部类的非静态成员覆盖
            System.out.println("c = "+c);
            //System.out.println("d = "+d);//不能访问外部类的非静态成员
        }
    }
    //定义非静态内部类
    class NoStaticInner{
        private final String a = "非静态内部类对象的非静态a";
        private final String c = "非静态内部类对象的非静态c";

        public void inFun(){
            System.out.println("NoStaticInner.inFun");
            System.out.println("Outer.a = "+Outer.a);
            //非静态内部类的非静态成员将外部类的静态成员覆盖
            System.out.println("a = "+ a);
            System.out.println("b = "+ b);
            //Outer.this.c访问外部类的非静态成员
            System.out.println("Outer.c = "+Outer.this.c);
            System.out.println("c = "+c);
            System.out.println("d = "+d);
        }

        public static void inMethod(){}

    }

    public NoStaticInner getNoStaticInner(){
        return new NoStaticInner();
    }

}
