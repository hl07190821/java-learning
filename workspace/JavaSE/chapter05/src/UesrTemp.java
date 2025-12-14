/**
 * ClassName: Uesr
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/13 23:03
 * @Version 1.0
 */
public class UesrTemp {
    String name;
    String password;

    /**
     * 实现用户登录的判断
     *
     * @param inputName 输入的用户名
     * @param inputPwd 输入的密码
     */
    public void login(String inputName,String inputPwd){
        /**
         * equals比较内容是否相同
         * == 比较引用内存地址是否相同
         */
        if (name.equals(inputName) && password.equals(inputPwd)){
            System.out.println("登录成功：欢迎您："+name);
        }else {
            System.out.println("登录失败：用户名或密码错误！");
        }
    }

    /**
     * 实现用户登录的判断
     * @param inputName 输入的用户名
     * @param inputPwd 输入的密码
     * @return true：登录成功 false：登录失败
     */
    public  boolean login1(String inputName,String inputPwd){

        return name.equals(inputName) && password.equals(inputPwd);
    }


}
