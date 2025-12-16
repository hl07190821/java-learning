package StaticTest.CodeBlockOverrideTest;/**
* ClassName: Mid2
* Package: StaticTest.CodeBlockOverrideTest
* Description:
* @Author Soon
* @Create 2025/12/16 16:45
* @Version 1.0
*/
public class Mid1 {
    static {
        System.out.println("Mid的静态初始化块");
    }

    {
        System.out.println("Mid的普通初始化块");
    }

    public Mid1(){
        System.out.println("Mid的无参构造器");
    }

    public Mid1(String msg){
        //通过this调用同一类中重载的构造器
        //构造器中super和this只能选择一个使用
        //super()：调用父类构造器（显式写，或隐式默认调用super()无参构造器）
        //this()：调用本类中重载的其他构造器
        this();
        System.out.println();
        System.out.println("Mid的含参构造器，其数值为："+msg);
    }
}
