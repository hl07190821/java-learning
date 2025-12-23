package InnerClass.LocalInnerClass;

/**
 * ClassName: Outer
 * Package: InnerClass.LocalInnerClass
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 22:42
 * @Version 1.0
 */
public class Outer {

    public static void outMethod(){
        final String c = "局部变量";
        class Inner{
            public void inMethod(){
                System.out.println("Inner.inMethod");
                System.out.println(c);
            }
        }
        Inner in = new Inner();
        in.inMethod();
    }

    public void outTest(){
        class Inner{
            public void inMethod1(){
                System.out.println("Inner.inMethod1");
            }
        }
        Inner in = new Inner();
        in.inMethod1();
    }

    public static Runner getRunner(){
        class LocalRunner implements Runner{
            @Override
            public void run() {
                System.out.println("LocalRunner.run");
            }
        }
        //多态
        return new LocalRunner();
    }
}
