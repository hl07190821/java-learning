package InheritTest.OverridingAndOverloading;

/**
 * ClassName: Father
 * Package: InheritTest.OverridingAndOverloading
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 14:35
 * @Version 1.0
 */
public class Father {
    public void method(int i){
        System.out.println("Father.method");
    }

    private void privateTest(){
        System.out.println("Father.private");
    }
}
