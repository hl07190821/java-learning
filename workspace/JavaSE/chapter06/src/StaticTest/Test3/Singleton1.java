package StaticTest.Test3;

/**
 * ClassName: Singleton
 * Package: StaticTest.Test3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 14:51
 * @Version 1.0
 */
//饿汉式
/**
 * 特点：立即加载，即在使用类的时候已经将对象创建完毕
 * 优点：实现起来简单，没有多线程安全问题
 * 缺点：当类被加载的时候，会初始化static的实例，静态变量被创建并分配内存空间，从这以后，
 * 这个static的实例便一直占着这块内存，知道类被卸载时，静态变量被存辉，并释放所有内存，
 * 因此在某特定条件下会耗费内存
 */

/**
 * 应用场景：
 * 由于单例模式只生成一个实例，减少了`系统性能开销`，
 * 当一个对象的产生需要比较多的资源时，如读取配置、产生其他依赖对象时，
 * 则可以通过在应用启动时直接产生一个单例对象，然后永久驻留内存的方式来解决。
 */

public class Singleton1 {
    //1，私有化构造器,使只能从类的内部创建实例
    private Singleton1(){}

    //2,内部提供一个当前类的实例
    //此实例也必须静态，因为静态方法只能调用静态变量
    //private是为了让实例无法被类外修改
    private static final Singleton1 single = new Singleton1();

    //3,提供公共的静态的方法，因为无法创建实例，因此只能通过类访问静态方法，返回唯一实例
    public static Singleton1 getInstance(){
        return single;
    }
}
