package Final;

/**
 * ClassName: Test2
 * Package: Final
 * Description:
 * final修饰局部变量
 * @Author Soon
 * @Create 2025/12/21 21:44
 * @Version 1.0
 */
public class Test2 {
    //private final String INFO;

    public static void main(String[] args) {
        //此处不手动对MIN_SCORE进行初始化不会报错，默认值为0
        final int MIN_SCORE;
        //对MIN_SCORE进行初始化
        MIN_SCORE = 0;
        final int MAX_SCORE;
        MAX_SCORE = 100;
        //不能在成员方法中对final修饰的成员变量进行初始化
        // INFO = "Java";
    }
}
