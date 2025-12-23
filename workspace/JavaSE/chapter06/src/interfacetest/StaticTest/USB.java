package interfacetest.StaticTest;

/**
 * ClassName: USB
 * Package: interfacetest.StaticTest
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 19:48
 * @Version 1.0
 */
public interface USB {
    int MAX_SPEED = 100;
    static void show(){
        //public static 可以省略
        System.out.println("Zoe LOVE");
    }


    void print();
}
