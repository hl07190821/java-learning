/**
 * ClassName: StringTools
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/14 17:39
 * @Version 1.0
 */

public class StringTools {
    /**
     * 可变形参的方法
     * 可变参数方法的使用与方法参数部分使用数组是一致的，二者不能同时声明，否则报错
     * 可变参数方法与同名的方法之间，彼此构成重构
     * 在一个方法的形参中，最多只能声明一个可变个数的形参
     */
    void test(String... args){}

    //void test(String[] argss){}

    //void test(String... x,String... y){}

    /**
     * n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串“”
     * @param separator 分隔符
     * @param args 要进行分隔的字符串数组
     */
    String concat(char separator,String... args) {
        String str = "";
        for (int i = 0;i < args.length;i++){

            //只有第一个字符前面不用加分隔符
            if (i == 0){
                //并不是引用类型变量指向的字符串常量池中的地址相加
                //Java重载的字符串的+号
                //因为地址相加是没有意义的
                str += args[i];
            }else{
                str += separator + args[i];
            }

        }
        return str;
    }
}
