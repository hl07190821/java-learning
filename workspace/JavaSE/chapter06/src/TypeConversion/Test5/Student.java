package TypeConversion.Test5;

/**
 * ClassName: Student
 * Package: TypeConversion.Test5
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/18 16:54
 * @Version 1.0
 */
public class Student extends Person{
    protected String school = "pku";
    public String getInfo(){
        //先从局部变量开始寻找
        return "Name:" + name + "\nage:" + age+"\nschool:"+school;
    }
}
