package InheritTest.Test1;

/**
 * ClassName: Mankind
 * Package: InheritTest.Usage1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 22:19
 * @Version 1.0
 */
public class Mankind {
    int sex;
    int salary;

    public void manOrWoman(){
        if(this.sex == 1){
            System.out.println("man");
        }else {
            System.out.println("woman");
        }
    }

    public void employeed(){
        if(salary == 0){
            System.out.println("no job");
        }else {
            System.out.println("job");
        }
    }
}
