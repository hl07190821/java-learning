package TypeConversion.Test2;

/**
 * ClassName: Sub
 * Package: TypeConversion.Test2
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/18 11:38
 * @Version 1.0
 */
public class Sub extends Base {
    //只能接受数组
    @Override
    public void add(int a,int[] arr){
        System.out.println("sub_1");
    }

    //@Override 不构成重写
    //重载
    public void add(int a ,int b,int c){
        System.out.println("sub_2");
    }

    //可以接受可变数组或参数
    @Override
    public void sum(int a ,int... arr){
        System.out.println("数组测试，sub");
    }
}
