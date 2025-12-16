package InheritTest.Test1;

/**
 * ClassName: CylinderTest
 * Package: InheritTest.Test1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 22:35
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();


        System.out.println(cylinder1.getRadius());//Radius = 1.0说明父类的无参构造被自动调用了
        System.out.println(cylinder1.getLength());
        System.out.println(cylinder1.findVolume());
    }
}
