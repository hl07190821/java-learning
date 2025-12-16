package StaticTest.CodeBlockOverrideTest;

/**
 * ClassName: Father
 * Package: StaticTest.CodeBlockOverrideTest
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 17:16
 * @Version 1.0
 */
public class Father {
    static {
        System.out.println("11111111111");
    }
    {
        System.out.println("22222222222");
    }

    public Father() {
        System.out.println("33333333333");

    }
}
