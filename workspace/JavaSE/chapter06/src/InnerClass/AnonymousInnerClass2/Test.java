package InnerClass.AnonymousInnerClass2;

/**
 * ClassName: Test
 * Package: InnerClass.AnonymousInnerClass2
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 22:58
 * @Version 1.0
 */
//匿名内部类的对象作为实参
public class Test {
    public static void test(A a){}

    public static void main(String[] args) {
        test(new A() {
            @Override
            public void method() {
                System.out.println("aaaa");
            }
        });
    }
}
