package StaticTest.Test1;

/**
 * ClassName: EmployeeTest
 * Package: StaticTest.Usage1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 13:44
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //静态变量total的默认值是0
        System.out.println("Employee.toal = "+Employee.getTotal());

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        System.out.println(e1);
        System.out.println(e2);
        System.out.println("Employee.total = "+ Employee.getTotal());

        Employee.company = "尚硅谷";
        System.out.println(e1);
        System.out.println(e2);

        Employee.company = "超级尚硅谷";

        System.out.println(e1);
        System.out.println(e2);
    }
}
