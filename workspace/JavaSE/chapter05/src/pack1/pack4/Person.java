package pack1.pack4;

/**
 * ClassName: Person
 * Package: pack1.pack4
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/15 20:03
 * @Version 1.0
 */
public class Person {
    private int age;
    public void setAge(int a){
        if(a >= 0 && a <= 130){
            age = a;
        }else {
            System.out.println("年龄不合理");
        }
    }

    public int getAge(){
        return age;
    }
}
