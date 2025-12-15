package pack1.pack3;

/**
 * ClassName: Student
 * Package: pack1.pack3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/15 20:37
 * @Version 1.0
 */
public class Student {
    private final String name;
    private final int age;
    private String school;
    private String major;

    public Student(String n,int a){
        name = n;
        age = a;
    }

    public Student(String n,int a,String s){
        name = n;
        age = a;
        school = s;
    }

    public Student(String n,int a,String s,String m){
        name = n;
        age = a;
        school = s;
        major = m;
    }

    public String getInfo(){
        return "name:" + name + " age:" + age + " school:" + school + " major:" + major;
    }
}
