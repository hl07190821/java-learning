package Final;

/**
 * ClassName: Test3
 * Package: Final
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/21 22:25
 * @Version 1.0
 */
public class Test3 {
    public int addOne(final int x){
        //return x++;//报错，final修饰形参，形参不可变
        return x+1;
    }
}
