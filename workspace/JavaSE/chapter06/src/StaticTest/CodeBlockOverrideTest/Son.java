package StaticTest.CodeBlockOverrideTest;

/**
 * ClassName: son
 * Package: StaticTest.CodeBlockOverrideTest
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 17:16
 * @Version 1.0
 */
public class Son extends Father{
    static {
        System.out.println("44444444444");
    }

    {
        System.out.println("55555555555");
    }
    public Son() {
        System.out.println("66666666666");
    }

    //在整个main函数之前先调用父类静态代码块再调用子类的静态代码块
    public static void main(String[] args) {
        System.out.println("77777777777");
        System.out.println("************************");
        new Son();
        System.out.println("************************");
        new Son();
        System.out.println("************************");
        new Father();
    }
}
