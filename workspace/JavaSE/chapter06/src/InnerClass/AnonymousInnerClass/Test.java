package InnerClass.AnonymousInnerClass;

/**
 * ClassName: Test
 * Package: InnerClass.AnonymousInnerClass
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 22:52
 * @Version 1.0
 */
//使用匿名内部类的对象直接调用方法
public class Test {
    public static void main(String[] args) {
        new A(){
            @Override
            public void a(){
                System.out.println("aaaa");
            }
        }.a();
    }
}
