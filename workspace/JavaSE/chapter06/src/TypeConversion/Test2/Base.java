package TypeConversion.Test2;

/**
 * ClassName: Base
 * Package: TypeConversion.Order
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/18 11:37
 * @Version 1.0
 */
public class Base {

    //可以接受数组或者可变参数
    public void add(int a,int... arr){
        System.out.println("base");
    }

    //只能接受数组
    public void sum(int a,int [] arr){
        System.out.println("base数组测试");
    }
}
