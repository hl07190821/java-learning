package pack1.pack2;

/**
 * ClassName: Student
 * Package: pack1.pack2
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/15 20:27
 * @Version 1.0
 */
/**
 * 关于构造器（constructor）
 * 1，构造器名必须与它所在的类名相同
 * 2，它没有返回值，所以不需要返回类型
 * 3，构造器的修饰符只能是权限修饰符，不能被其他任何修饰，比如不能被static，final，synchronized，abstract，native修饰，不能有return语句返回值
 */

public class Student {
   private String name;
   private int age;

   //无参构造
    public Student(String n,int a){
        name = n;
        age = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getAge(){
        return  age;
    }

    public  void setAge(int a){
        age = a;
    }

    public String gerInfo(){
        return "姓名：" + name + "年龄：" + age;
    }
}
