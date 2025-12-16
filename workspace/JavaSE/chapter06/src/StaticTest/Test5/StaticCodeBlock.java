package StaticTest.Test5;

/**
 * ClassName: CodeBlockTest
 * Package: StaticTest.Test5
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 16:08
 * @Version 1.0
 */

/**
 * 如果成员变量想要初始化的值不是一个硬编码的常量值，
 * 而是需要通过复杂的计算或读取文件、或读取运行环境信息等方式才能获取的一些值，
 * 该怎么办呢？此时，可以考虑代码块（或初始化块）。
 */
//静态代码块
public class StaticCodeBlock {

    private static String country;
    private String name;

    public StaticCodeBlock(String name){
        //构造器和
        country = "China";
        System.out.println("构造器初始化，country = " +country);
    }
    {
        country = "Chinese" ;
        System.out.println("非静态代码块初始化，country = " +country);
    }
    //静态代码块
    //1，可对类的属性，类的声明进行初始化操作
    //2，不可以对非静态的属性初始化，即不可以调用非静态的属性和方法
    //3,若有多个静态的代码块，那么按照从上到下的顺序依次执行
    //4，静态代码块的执行要先于非静态大妈快
    //5，静态代码块随着类的加载而加载只执行一次
    static {
        country = "中国";
        //报错，静态代码块只能访问静态变量name = "张三"
        System.out.println("静态代码块初始化，country = " +country);
    }

}
