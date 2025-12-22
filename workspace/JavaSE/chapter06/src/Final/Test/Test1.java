package Final.Test;

/**
 * ClassName: Test1
 * Package: Final
 * Description:
 * final修饰成员变量
 * @Author Soon
 * @Create 2025/12/21 21:40
 * @Version 1.0
 */
public class Test1 {
    public static int totalNumber = 5;
    public final int ID;
    //1，若ID没有初始化，不用构造器给ID赋值会报错
    //2，若已经对ID初始化，用构造器给给ID赋值会报错
    public Test1(){
        ID = ++totalNumber;
    }
}
