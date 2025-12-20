package StaticTest.Test8;

/**
 * ClassName: Father
 * Package: StaticTest.Test8
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/21 20:57
 * @Version 1.0
 */
public class Father {
    private static int i = getNum("(1)i");
    private final int j = getNum("(2)j");
    static{
        print("(3)父类静态代码块");
    }
    {
        print("(4)父类非静态代码块，又称为构造代码块");
    }
    Father(){
        print("(5)父类构造器");
    }
    public static void print(String str){
        System.out.println(str + "->" +i);
    }
    public static int getNum(String str){
        print(str);
        return ++i;
    }
}
