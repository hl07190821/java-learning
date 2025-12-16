package InheritTest.Override;

/**
 * ClassName: OverrideRule
 * Package: InheritTest.Override
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 22:46
 * @Version 1.0
 */

/**
 * 1，子类重写的方法必须和父类别重写的方法具有相同的方法名称，参数列表
 * 2，子类重写的方法的返回值类型不能大于父类被重写的方法的返回值类型 例如(Student继承Person，那么Student < Person)
 * 3，子类重写的方法使用的访问权限不能小于父类别重写的方法权限(public > protected >缺省 > private)
 * 注意：1，父类私有方法不能重写2，跨包的父类缺省的方法也不能重写
 * 4，子类方法抛出的异常不能大于父类被重写的异常
 * 5，非静态方法才叫重写，静态方法叫做隐藏，并且static不能去掉
 */
public class OverrideRule {
}
