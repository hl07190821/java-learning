package SuperTest.Test3;

/**
 * ClassName: Usage3
 * Package: SuperTest.Test3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 16:17
 * @Version 1.0
 */
/**
 * 1，子类继承父类时，不会继承父类的构造器，只能通过super（形参列表）的方式，调用父类指定的构造器
 * 2，super（形参列表），必须声明在构造器的首行
 * 3，构造器的首行this 与 super二选一
 * 4，如果子类构造器的首行没有显式调用this 也没有显式调用super，默认调用super（）
 * 5，子类的任何一个构造器中，要么会调用本类中重载的构造器，要么会调用父类的构造器
 * 6，一个类中声明有n个构造器。最多有n-1个构造器使用this，则剩下的那个一定使用super（形参列表）
 *
 *
 * 常见错误：
 * 如果子类中既未显式调用父类或本类的构造器，且父类中又没有空参的构造器，则编译出错
 */

public class Usage3 {
}
