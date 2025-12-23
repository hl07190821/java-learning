package InnerClass.AnonymousInnerClass1;

/**
 * ClassName: Test
 * Package: InnerClass.AnonymousInnerClass1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 22:54
 * @Version 1.0
 */
//通过父类或父接口的变量多态引用匿名内部类的对象
public class Test {
    public static void main(String[] args) {
        A obj = new A(){
            @Override
            public void a() {
                System.out.println("aaaaaaaaa");
            }
        };
        obj.a();
    }

}
