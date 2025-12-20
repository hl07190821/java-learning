package StaticTest.CodeBlockOverrideTest;

/**
 * ClassName: Leaf
 * Package: StaticTest.CodeBlockOverrideTest
 * Description:
 * 1，当第一次使用Leaf类（比如创建leaf实例，或者访问leaf的静态成员），JVM会先加载Mid1（如果Mid1还没有被加载过），然后加载Leaf
 * 因此，执行顺序是：先执行Mid1的静态代码块，然后加载Leaf
 * 2，如果Mid1和Leaf中都有静态变量，那么静态变量的赋值操作和静态代码块是按照在类中出现的顺序执行的，而且父类的静态变量和静态代码块先于子类
 * @Author Soon
 * @Create 2025/12/16 16:46
 * @Version 1.0
 *
 */

public class Leaf extends Mid1
{
    static{
        System.out.println("Leaf的静态初始化块");
    }

    {
        System.out.println("Leaf的普通初始化块");
    }

    public Leaf(){
        //普通初始化块可以看作构造器的一部分，执行顺序为supe/this -> 普通初始化块 -> 构造器剩余部分
        //通super调用父类中有一个字符串参数的构造器
        //super("尚硅谷");
        System.out.println("Leaf的构造器");
    }
}
