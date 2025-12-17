package InheritTest.OverridingAndOverloading;

/**
 * ClassName: Daughter
 * Package: InheritTest.OverridingAndOverloading
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 14:37
 * @Version 1.0
 */
public class Daughter extends Father{

    //重载不会覆盖掉父类的方法
    public void method(int i,int j){
        System.out.println("Daughter.method");
    }
}
