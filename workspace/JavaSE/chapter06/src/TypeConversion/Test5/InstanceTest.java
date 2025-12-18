package TypeConversion.Test5;

/**
 * ClassName: InstanceTest
 * Package: TypeConversion.Test5
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/18 16:58
 * @Version 1.0
 */
public class InstanceTest {
    public static void method(Person person){
        person.getInfo();
        //判断person是Graduate还是它的子类
        if(person instanceof Graduate){
            System.out.println("a graduate");
        }else if(person instanceof Student){
            System.out.println("a student");
        }else if ((person instanceof Person)){
            System.out.println("a person");
        }
    }

    public static void main(String[] args) {
       Person person = new Person();
       Person student = new Student();
       Person graduate = new Graduate();
       method(person);
       method(student);
       method(graduate);
    }
}
