/**
 * ClassName: AnimalTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/13 20:02
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        //创建对象
        Animal xb = new Animal();
        xb.legs = 4;//访问属性
        System.out.println(xb.legs);
        xb.eat();
        xb.move();
    }
}
