package InheritTest.Test1;

/**
 * ClassName: Student
 * Package: InheritTest.Test1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 22:01
 * @Version 1.0
 */
/**
 * 当子类继承父类时，子类构造器必须调用父类构造器，调用方式有两种：
 * 1，隐式调用：默认调用父类的无参构造器
 * 2，显示调用：通过super（参数）调用父类的有参构造器
 */

public class Student extends Person{
    long number;

    int math;

    int English;

    int computer;


    //报错，public Student(){}
    //Per送中只有有参构造器，因此只能显式调用有参构造
    public Student(String name,char gender,int age,long number,int math,int english,int computer){
        super(name,gender,age);
        this.number = number;
        this.math = math;
        this.English = english;
        this.computer = computer;
    }

    public double aver(){
        return (double)(math + English + computer)/3;
    }

    public int max(){
        return computer>(math > English ? math:English)?computer:(math > English ? math:English);
    }
}
