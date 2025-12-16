package StaticTest.Test1;

/**
 * ClassName: Employee
 * Package: StaticTest.Test1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 13:25
 * @Version 1.0
 */
public class Employee {
    //私有化静态变量，类的外面必须使用get/set方法来访问静态变量
    private static int total;

    //要设置为static方法，不然通过方法访问静态变量将没有意义，因为必须创建对象
    public static void setTotal(int total){
        //推荐使用Employee.total而不是this.total
        Employee.total = total;
    }
    //同理，必须要声明static方法
    public static int getTotal(){
        return total;
    }

    static String company;//缺省权限修饰符，方便类外以“类名.静态变量”的方式进行访问
    private  int id;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    //构造器一般都是public
    // 如果使用private一般用于
    //1,单例模式-确保全局只有一个实例
    //2，工厂方法模式-封装对象的创建逻辑
    //3，工具类/常量化
    //如果一个类只有静态方法和静态变量，那么实例化它是没有意义的，私有化构造器可以防止被意外实例化
    public Employee(){
        //每次创建对象时，类变量total+1
        //同时id初始化等于total
        total++;
        id = total;
    }

    public Employee(String name){
        this();
        this.name = name;
    }

    @Override
    public String toString(){
        return "Employee{company = "+company+",id = "+id+",name = "+name + "}";

    }
}
