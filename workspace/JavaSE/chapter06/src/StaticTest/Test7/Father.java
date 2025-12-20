package StaticTest.Test7;

/**
 * ClassName: Father
 * Package: StaticTest.Test7
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/21 20:48
 * @Version 1.0
 */
public class Father {
    static{
        System.out.println("11111111");
    }
    {
        System.out.println("222222222");
    }
    public Father(){
        System.out.println("333333333");
    }
}
