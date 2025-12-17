package InheritTest.Test1;

/**
 * ClassName: KidTest
 * Package: InheritTest.Usage1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 22:24
 * @Version 1.0
 */
public class KidTest {
    public static void main(String[] args) {
        Kid kid1 = new Kid();

        kid1.yearsOld = 10;
        kid1.salary = 10;
        kid1.sex = 1;
        kid1.printAge();
        kid1.manOrWoman();
        kid1.employeed();
    }
}
