package Polymorphism.Test1.ThisTest.Test1;

/**
 * ClassName: This
 * Package: ThisTest.Usage1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 18:00
 * @Version 1.0
 */
/**
 * 1,不能出现递归调用，比如：调用自身构造器
 * 如果一个类中声明了n个构造器，则最多有n-1个构造器中使用了this
 * 2，this（）和this（实参列表）只能声明再构造器首行
 * 在类的一个构造器中，最d多只能声明一个this（）
 */
public class This {
}
