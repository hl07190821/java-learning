package Final.Test;

/**
 * ClassName: Test4
 * Package: Final
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/21 22:26
 * @Version 1.0
 */
public class Test4 {
    private int i;
    public void addOne(final Test4 t){
        //t = new Test4();//尝试给final参数重新赋值
        t.i++;
    }
}
