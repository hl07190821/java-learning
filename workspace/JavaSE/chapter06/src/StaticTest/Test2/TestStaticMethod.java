package StaticTest.Test2;

/**
 * ClassName: TestStaticMethod
 * Package: StaticTest.Order
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 14:31
 * @Version 1.0
 */

//静态方法的调用只看编译时的类型
public class TestStaticMethod {
    public static void main(String[] args) {

        //情况1：引用类型为Father,指向Son对象
        Father fatherRef = new Son();
        Father.fun() ;//Father.fun
        fatherRef.funTest();//Son.funTest

        //情况2：引用类型为Son
        Son sonRef = new Son();
        Son.fun();//Son.fun
        sonRef.funTest();//Son.funTest

        //情况3：正确的调用方式
        Father.fun();//Father.fun
        Son.fun();//Son.fun

    }

}
