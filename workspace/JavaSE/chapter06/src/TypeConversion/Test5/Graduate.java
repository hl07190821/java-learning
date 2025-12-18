package TypeConversion.Test5;

/**
 * ClassName: Graduate
 * Package: TypeConversion.Test5
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/18 16:56
 * @Version 1.0
 */
public class Graduate extends Student{
    public String major = "IT";
    public String getInfo(){
        return "name:"+name+"\nage:"+age+"\nschool:"+school+"\nmajor:"+major;
    }
}
