package SuperTest.Test2;

/**
 * ClassName: Usage2
 * Package: SuperTest.Order
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 16:05
 * @Version 1.0
 */
/**
 * 如果实例变量与局部变量重名，可以在实例变量前面加this进行区别
 *
 * 如果子类实例变量和父类实例变量重名，并且父类的该实例变量在子类依然可见，在子类中要
 * 访问父类声明的实例变量需要在父类实例变量前加super，否则默认访问的是子类自己声明的实例变量
 *
 * 如果父子类实例变量没有重名，只要权限修饰符允许，在子类中完全可以直接访问父类中
 * 声明的实例变量，可以用this访问，也可以用super访问
 */
public class Usage2 {
}
