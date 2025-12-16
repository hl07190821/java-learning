package StaticTest.Test5;

/**
 * ClassName: UnstaticCodeBlock
 * Package: StaticTest.Test5
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 16:19
 * @Version 1.0
 */
/**
 * 如果多个重载的构造器有公共代码，
 * 并且这些代码都是先于构造器其他代码执行的，
 * 那么可以将这部分代码抽取到非静态代码块中，减少冗余代码。
 */
public class UnstaticCodeBlock {
    /**
     * 1,可以有输出语句
     * 2，除了调用非静态的结构外，还可以调用静态的变量或方法
     * 3，若有多个非静态的代码块，那么按照从上到下的顺序依次执行
     * 4，每次创建对象的时候，都会执行一次，且先于构造器执行
     */
}
