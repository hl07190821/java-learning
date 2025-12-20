package Object.Equals;

/**
 * ClassName: Test1
 * Package: Object.Equals
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/20 16:51
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        int it = 65;
        float f1 = 65.0f;

        //自动类型提升
        //int(65)与float(65.0f)在数值上相等，所以返回true，java会及逆行自动类型提升
        //int提升为float然后比较
        System.out.println("65和65.0f是否相等？"+(it == f1));

        char ch1 = 'A';
        char ch2 = 12;

        //12包含了两个字符，而’‘只能包含一个字符
        //char ch3 = '12';
        //char类型的’A‘的ASCII码是65，所以比较的是65 == 65，结果为true
        System.out.println("65和'A'是否相等？"+(it == ch1));
        //char可以存储0-65535的整数。ch2 = 12存储的就是整数12，所以12 = ch2比较的是12 == 12结果为true
        System.out.println("12和ch2是否相等？"+(12 == ch2));

        String str1 = "hello";
        String str2 = "hello";
        //比较内存地址
        System.out.println("str1和str2是否相等？"+(str1 == str2));

        //比较内容
        System.out.println("str1是否equal str2?"+(str1.equals(str2)));

        //不可比较的类型，String和Date是完全不相关的类型，不能用==比较
        //System.out.println("hello" = new java.util.Date());
    }
}
