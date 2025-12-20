package Object.finalize;

/**
 * ClassName: FinalizeTest
 * Package: Object.finalize
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/20 18:47
 * @Version 1.0
 */
public class FinalizeTest {
    public static void main(String[] args) {
        Person p = new Person("peter",21);
        System.out.println(p);
        p = null;//此时对象实体就是垃圾对象，等待被回收，但时间不确定
        System.gc();//强制性释放空
    }
}
