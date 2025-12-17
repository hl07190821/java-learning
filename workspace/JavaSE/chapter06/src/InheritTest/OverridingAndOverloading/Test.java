package InheritTest.OverridingAndOverloading;

/**
 * ClassName: Test
 * Package: InheritTest.OverridingAndOverloading
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 14:38
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Son son1 = new Son();
        son1.method(1);

        Daughter daughter1 = new Daughter();
        daughter1.method(1);
        daughter1.method(1,2);
    }
}
