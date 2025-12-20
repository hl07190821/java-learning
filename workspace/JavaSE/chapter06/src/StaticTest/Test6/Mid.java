package StaticTest.Test6;

/**
 * ClassName: Mid
 * Package: StaticTest.Test6
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/21 20:40
 * @Version 1.0
 */
public class Mid extends Root{
    static {
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化块");
    }
    public Mid(){
        System.out.println("Mid的无参数的构造器");
    }
    public Mid(String msg){
        //通过this调用同一类的无参构造器
        this();
        System.out.println("Mid的带参数构造器，其参数值："+msg);
    }
}
