package Object.getClass;

import Object.finalize.Person;

/**
 * ClassName: Test
 * Package: Object.getClass
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/20 18:54
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Object obj = new Person();
        System.out.println(obj.getClass());
        //结果为：class Object.finalize.Person
    }
}
