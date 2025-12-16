package InheritTest.Test1;

/**
 * ClassName: Person
 * Package: InheritTest.Test1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 22:01
 * @Version 1.0
 */
public class Person {
    String name;
    char gender;
    int age;
    //public Person(){}
    public Person(String name,char gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    @Override
    public String toString(){
        return name+"的性别是："+gender+"，年龄是："+age;
    }
}
