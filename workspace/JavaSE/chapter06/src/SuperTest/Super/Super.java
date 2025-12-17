package SuperTest.Super;

/**
 * ClassName: Super
 * Package: SuperTest.Super
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 15:52
 * @Version 1.0
 */
/**
 * 在java中使用super来调用父类中的指定操作：
 * super可以用于访问父类中定义的属性
 * super可用于调用父类中定义的成员方法
 * super可用于子在子类构造器中调用父类的构造器
 *
 * 注意：
 * 尤其当子父类中出现同名成员时，可以用super表明调用的是父类中的成员
 * super的追溯不仅限于直接父类
 * super和this用法相近，this代表本类对象的引用，super代表父类的内存空间的表示
 */

/**
 * 方法前面没有this和super
 * 先从局部变量找匹配，再从本类中找匹配，最后直接从父类找，再没有，继续往上追溯
 * 方法前面有this
 * 先从子类找匹配，如果没有，再从直接父类找，再没有，继续网上追溯
 * 方法前有super：
 * 从当前子类的父类直接找，如果没有继续网上追溯
 */

public class Super {
}
