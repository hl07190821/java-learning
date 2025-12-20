package StaticTest.Test6;

/**
 * ClassName: Root
 * Package: StaticTest.Test6
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/21 20:39
 * @Version 1.0
 */
public class Root {
    static {
        System.out.println("Root的静态初始化");
    }
    {
        System.out.println("Root的普通初始化");
    }
    public Root(){
        System.out.println("Root的无参数的构造器");
    }
}

