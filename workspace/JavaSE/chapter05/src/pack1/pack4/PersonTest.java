package pack1.pack4;

/**
 * ClassName: PersonTest
 * Package: pack1.pack4
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/15 20:05
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setAge(100);
        person2.setAge(150);

        System.out.println(person1.getAge());
        System.out.println(person2.getAge());
    }
}
