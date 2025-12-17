package InheritTest.OverridingAndOverloading;

/**
 * ClassName: Son
 * Package: InheritTest.OverridingAndOverloading
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 14:36
 * @Version 1.0
 */
public class Son extends Father{
    @Override
    //重写会覆盖掉父类的方法
    public void method(int i){
        System.out.println("Son.Method");
    }
    //@Override
    //并不是重写，因为父类的private方法不可见
    //子类并没有继承父类的private方法
    //default包级私有
    void privateTest(){
        System.out.println("Son.private");
    }
}
