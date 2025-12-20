package StaticTest.Test3;

/**
 * ClassName: Singleton2
 * Package: StaticTest.Test3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 15:00
 * @Version 1.0
 */
//懒汉式
/**
 * 特点：延迟加载，即在调用静态方法时实例才被创建
 *  * 优点：实现起来比较简单，当类别加载的时候，static的实例未被创建并分配内存空间
 *  * 当静态方法第一次被调用时，初始化实例变量，并分配内存，因此在某些特定条件下会
 * 节约内存。
 * 缺点：在多线程环境中，这种实现方法使完全错误的，线程不安全，根本不能保证单例的唯一性
 */
public class Singleton2 {
    //1，私有化构造器
    private Singleton2(){
    }
    //2,内部提供一个当前类的实例
    private static Singleton2 single;

    //3，提供公共的静态的方法，返回当前类的对象
    public static Singleton2 getInstance(){
        if (single == null){
            single = new Singleton2();
        }
        return single ;
    }
}
