package pack1.pack3;

/**
 * ClassName: StudentTest
 * Package: pack1.pack3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/15 20:41
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("张三",10);
        Student student2 = new Student("李四",20,"UESTC");
        Student student3 = new Student("王五",30,"UESTC","BiomedicalEngineering");

        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());
        System.out.println(student3.getInfo());
    }
}
