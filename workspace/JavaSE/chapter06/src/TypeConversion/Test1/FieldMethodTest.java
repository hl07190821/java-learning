package TypeConversion.Test1;

/**
 * ClassName: FieldMethodTest
 * Package: TypeConversion.User
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 22:18
 * @Version 1.0
 */
public class FieldMethodTest {
    public static void main(String[] args){
        Sub s = new Sub();
        //20
        System.out.println(s.count);
        //20
        s.display();
        Base b = s;
        //true，因为b与s指向同一个对象
        System.out.println(b == s);
        //注意，属性没有多态！看的是引用的编译时类型
        System.out.println(b.count);
        //方法有多态，运行时看实际类型（Sub），所以调用Sub的display
        b.display();
    }
}
