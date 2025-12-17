package InheritTest.OverridingAndOverloading;

import InheritTest.Override.Mother;

/**
 * ClassName: MotherSon
 * Package: InheritTest.OverridingAndOverloading
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 14:48
 * @Version 1.0
 */
public class MotherSon extends Mother {
    //@Override不构成重写，因为default是包级私有
    public void method(){
        System.out.println("MotherSon.method");
    }

}
