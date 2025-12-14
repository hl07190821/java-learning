/**
 * ClassName: StringToolsTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/14 17:54
 * @Version 1.0
 */
public class StringToolsTest {
    public static void main(String[] args) {
        StringTools tools = new StringTools();
        //0字符串
        System.out.println(tools.concat('_'));
        //一个字符串
        System.out.println(tools.concat('_',"hello"));
        System.out.println(tools.concat('_',"hello","World"));

        System.out.println(tools.concat('_',"Hello","World","java"));

    }
}
