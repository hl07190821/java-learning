package StaticTest.Test1;

/**
 * ClassName: Chinese
 * Package: StaticTest.Test1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 13:09
 * @Version 1.0
 */
public class Chinese {
    //实例变量
    private String name;
    private int age;
    //类变量
    static String nation;

    public Chinese(){}
    //构造器可以访问类变量
    public Chinese (String name,int age){
        this.name = name;
        this.age = age;
    }

    //实例方法可以访问类变量
    @Override
    public String toString(){
        return "Chinese{" +
                "name = " + name + '\'' +
                ",age = " + age +
                ",nation = " + nation + '\'' +
                '}';
    }
}
