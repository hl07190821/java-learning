package InheritTest.PermissionModifier;

/**
 * ClassName: PermissionModifier
 * Package: InheritTest.PermissionModifier
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 15:34
 * @Version 1.0
 */

/**
 * 类权限修饰符：
 * oublic default
 * default类仅限本包类使用
 *
 * 成员权限修饰符：
 * private：仅限此类
 * default：本包子类和非子类可见
 * protected：其他包仅限于子类可见
 * public：都可见
 *
 * 注意：跨包使用时，如果类的权限修饰符缺省，成员权限修饰符>类的权限修饰符也没有意义
 */

public class PermissionModifier {
}
