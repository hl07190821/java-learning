package InheritTest.PermissionModifier;

import InheritTest.OverridingAndOverloading.Grandfather;

/**
 * ClassName: Passerby
 * Package: InheritTest.PermissionModifier
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 15:45
 * @Version 1.0
 */
public class Passerby {

    Grandfather grandfather = new Grandfather();

    public void main(String[] args) {

        System.out.println(grandfather.a);
       /* //protected
        System.out.println(grandfather.b);
        //default
        System.out.println(grandfather.c)
        //private
        System.out.println(grandfather.d);;*/

    }
}
