package StaticTest.CodeBlockOverrideTest;

/**
 * ClassName: Leaf
 * Package: StaticTest.CodeBlockOverrideTest
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 16:46
 * @Version 1.0
 */
public class Leaf extends Mid1{
    static{
        System.out.println("Leaf的静态初始化块");
    }

    {
        System.out.println("Leaf的普通初始化块");
    }

    public Leaf(){
        //普通初始化块可以看作构造器的一部分，执行顺序为supe/thisr -> 普通初始化块 -> 构造器剩余部分
        //通super调用父类中有一个字符串参数的构造器
        //super("尚硅谷");
        System.out.println("Leaf的构造器");
    }
}
