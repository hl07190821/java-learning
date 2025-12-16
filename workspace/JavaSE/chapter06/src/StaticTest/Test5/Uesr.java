package StaticTest.Test5;

/**
 * ClassName: Uesr
 * Package: StaticTest.Test5
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 16:22
 * @Version 1.0
 */
public class Uesr {
    private String uesrname;
    private String password;
    private final long registrationTime;

    public Uesr(){
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
        uesrname = registrationTime+"";
        password = "123456";
    }

    public Uesr(String uesrname,String password){
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
        this.uesrname = uesrname;
        this.password = password;
    }

    public String getUesrname(){
        return uesrname;
    }

    public String getPassword(){
        return password;
    }

    public long getRegistrationTime(){
        return registrationTime;
    }

    public void setUesrname(String uesrname){
        this.uesrname = uesrname;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getInfo(){
        return "用户名："+uesrname+"，密码："+password+"，注册时间："+registrationTime;
    }
}
