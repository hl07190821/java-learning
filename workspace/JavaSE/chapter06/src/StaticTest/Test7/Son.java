package StaticTest.Test7;

/**
 * ClassName: Son
 * Package: StaticTest.Test7
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/21 20:50
 * @Version 1.0
 */
public class Son extends Father{
    static {
        System.out.println("44444444");
    }
    {
        System.out.println("55555555");
    }
    public Son(){
        System.out.println("666666666");
    }

    //在运行Son的main方法时，因为main方法是Son类的静态方法，所以需要先加载Son类
    //但是Son类继承Father类，所以JVM会先加载Father类，然后再加载Son类
    public static void main(String[] args) {
        System.out.println("777777777777777");
        System.out.println("***************");
        new Son();
        System.out.println("****************");
        new Son();
        System.out.println("****************");
        new Father();
    }
}
