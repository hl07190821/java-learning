package StaticTest.Test6;

/**
 * ClassName: Leaf
 * Package: StaticTest.Test6
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/21 20:43
 * @Version 1.0
 */
public class Leaf extends Mid{
    static {
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }
    public Leaf(){
        //通过super调用父类中有一个字符串参数的构造器
        super("尚硅谷");
        /**
         * super调用父类的构造器之后
         * 再运行本类构造器
         * 本类构造器中包含了本类的普通初始化块
         */
        System.out.println("Leaf的构造器");
    }
}
