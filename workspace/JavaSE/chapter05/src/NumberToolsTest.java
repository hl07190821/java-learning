/**
 * ClassName: NumberToolsTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/14 18:00
 * @Version 1.0
 */
public class NumberToolsTest {
    public static void main(String[] args) {
        NumberTools tools = new NumberTools();

        System.out.println(tools.sum(1,2,3,4,5));

        //报错，因为total方法的形参类型是数组System.out.println(tools.total((1,2,3,4,5)));
        System.out.println(tools.total(new int[]{1,2,3,4,5}));


    }
}
