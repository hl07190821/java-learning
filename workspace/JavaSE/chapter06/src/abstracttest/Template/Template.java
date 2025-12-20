package abstracttest.Template;

/**
 * ClassName: Template
 * Package: abstracttest.Test3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/21 23:05
 * @Version 1.0
 */
abstract class Template {
    public final void getTime(){
        long start = System.currentTimeMillis();
        //将code扩展出去，让子类进行具体的实现
        code();
        long end = System.currentTimeMillis();
        System.out.println("执行时间是："+(end - start));
    }

    public abstract void code();
}
