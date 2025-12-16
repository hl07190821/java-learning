package StaticTest.CodeBlockOverrideTest;

/**
 * ClassName: Root
 * Package: StaticTest.CodeBlockOverrideTest
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 16:37
 * @Version 1.0
 */
public class Root {
    static {
        System.out.println("Root的静态初始化块");
    }

    {
        System.out.println("Root的普通初始化");
    }

    public Root(){
        System.out.println("Root的无参构造器初始化");
    }
}

