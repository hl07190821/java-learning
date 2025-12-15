package pack1.pack2;

/**
 * ClassName: PrivatePersonTest
 * Package: pack1.pack2
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/15 19:17
 * @Version 1.0
 */
public class PrivatePersonTest {
    public static void main(String[] args) {
        PrivatePerson p = new PrivatePerson();

        //实例变量私有化，跨类是无法直接使用的
        /*p.name = "张三";
        p.age = 1;
        p.marry = true;*/

        p.setAge(10);
        p.setMarry(true);
        p.setName("张三");
        System.out.println(p.getAge());
        System.out.println(p.getMarry());
        System.out.println(p.getName());
    }
}
