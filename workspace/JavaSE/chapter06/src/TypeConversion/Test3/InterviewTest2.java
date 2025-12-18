package TypeConversion.Test3;

/**
 * ClassName: InterviewTest2
 * Package: TypeConversion.Test3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/18 16:17
 * @Version 1.0
 */
public class InterviewTest2 {
    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son();

        System.out.println(father.getInfo());//atguigu
        System.out.println(son.getInfo());//尚硅谷
        son.test();//尚硅谷 atguigu
        System.out.println("------------------------");
        son.setInfo("大硅谷");
        System.out.println(father.getInfo());
        System.out.println(son.getInfo());
        son.test();
    }
}
