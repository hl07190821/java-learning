package pack1.pack2;

/**
 * ClassName: StudentTest
 * Package: pack1.pack2
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/15 20:33
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        //调用无参构造创造学生对象
        //如果只写了有参构造，调用无参构造时会报错
        //换言之，如果不写有参构造不写无参构造，默认无参构造
        //但是写了有参构造没写无参构造就只能用有参构造
        //Student s1 = new Student();

        Student s1 = new Student("张三",10);

        System.out.println(s1.gerInfo());

    }
}
