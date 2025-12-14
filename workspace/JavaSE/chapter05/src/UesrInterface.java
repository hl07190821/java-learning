import java.util.Scanner;

/**
 * ClassName: UesrInterface
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/14 13:37
 * @Version 1.0
 */
public class UesrInterface {
    public static void main(String[] args) {

        UesrTemp u1 = new UesrTemp();
        u1.name = "Tom";
        u1.password = "abc123";

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = scanner.next();
        System.out.println("请输入密码：");
        String pwd = scanner.next();

        //演示1：
        //u1.login(name,pwd);

        //演示2：
        boolean idLogin = u1.login1(name,pwd);

        if(idLogin){
            System.out.println("登录成功：欢迎你："+name);
        }else {
            System.out.println("登录失败：用户名或者密码错误！");
        }

        scanner.close();

    }
}
