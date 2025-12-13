/**
 * ClassName: Person
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/13 19:55
 * @Version 1.0
 */
public class Person {
    String name;
    char gender;
    int age;
    int sex;
    Dog dog;
    //类中的方法，能调用类中的属性
    public static void main(String[] args){
        Person p1 = new Person();
        eat();
    }
    //喂宠物
    public void feed(){
        dog.eat();
    }

    public static void eat(){
        sleep();
        System.out.println("人：吃饭");
    }
    public  static  void  sleep(){
        System.out.println("人：睡觉");
        doSport();
    }
    public  static  void  doSport(){
        System.out.println("人：运动");
    }

    public void study(){
        System.out.println("成绩为："+0);
    }

    public void  showAge(){
        System.out.println("年龄为："+age);
    }

    public int addAge(int i){
        return age+i;
    }

}
