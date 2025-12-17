package InheritTest.PermissionModifier;

import InheritTest.OverridingAndOverloading.Grandfather;

/**
 * ClassName: Son
 * Package: InheritTest.PermissionModifier
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 15:42
 * @Version 1.0
 */
public class Son extends Grandfather {
    //静态方法只能访问本类中的静态属性和静态方法
    //但是对于其他类中的，它可以访问任何它有权限的成员（static/非静态）
    public static void main(String[] args) {
        System.out.println(new Son().a);
        System.out.println(new Son().b);
       /* //default 仅限本包子类和非子类
        System.out.println(new Son().c);
        //private 仅限本类
        System.out.println(new Son().d);*/
    }
}
