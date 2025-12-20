package StaticTest.Test8;

/**
 * ClassName: Son
 * Package: StaticTest.Test8
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/21 21:01
 * @Version 1.0
 */
public class Son extends Father{
    /**
     *当创建子类实例时，子类的构造方法会隐式或显式地调用父类的构造方法（通过super()）。
     * 在父类的构造方法执行过程中，父类的实例变量（包括私有变量）会被初始化。
     * 因此，子类实例中包含了父类的所有实例变量（包括私有变量），
     * 但是子类不能直接访问父类的私有变量（只能通过父类提供的公共/受保护的方法访问）。
     */
    /**
     * 1，此处静态变量在静态代码块前，优先进行静态变量的声明和初始化
     * 2，相同的静态方法，若不加区分，优先调用子类的静态方法
     */
    private static int k = getNum("(6)k");
    /**
     * 在执行构造代码块之前，先进行成员变量的声明和初始化
     */
    private final int j = getNum("(7)h");
    static {
        print("(8)子类静态代码块");
    }
    {
        print("(9)子类非静态代码块，又称为构造代码块");
    }
    Son(){
        print("(10)子类构造器");
    }
    //静态方法不能被重写，但是可以被子类调用
    public static void print(String str){
        System.out.println(str +"->" + k);
    }
    public static int getNum(String str){
        print(str);
        return ++k;
    }

}
