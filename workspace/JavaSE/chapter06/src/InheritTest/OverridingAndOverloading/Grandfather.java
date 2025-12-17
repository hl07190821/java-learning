package InheritTest.OverridingAndOverloading;

/**
 * ClassName: Grandfather
 * Package: InheritTest.OverridingAndOverloading
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 15:40
 * @Version 1.0
 */
public class Grandfather {
    public int a;
    protected int b;//跨包仅限子类使用
    int c;//仅限本包子类和非子类使用
    private int d;//仅限本类
}

