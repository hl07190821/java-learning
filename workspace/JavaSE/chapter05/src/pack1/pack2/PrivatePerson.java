package pack1.pack2;

/**
 * ClassName: PrivatePerson
 * Package: pack1.pack2
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/15 19:07
 * @Version 1.0
 */
public class PrivatePerson {
    /**
     * 注意使用private修饰成员变量，private p非大写
     *     private修饰结构：成员变量，成员方法，成员内部类，构造器
     *     private修饰范围：本类内部
     */
    private String name;
    private int age;
    private boolean marry;

    /**
     * 提供getXXX方法/setXXX方法，可以访问成员变量
     */
    public void setName(String n){
        //注意不要和成员变量同名
        // name = name;
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }

    public void setMarry(boolean m){
        marry = m;
    }

    public boolean getMarry(){
        return marry;
    }
}
