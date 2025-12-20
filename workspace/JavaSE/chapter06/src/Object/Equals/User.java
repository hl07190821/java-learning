package Object.Equals;


/**
 * ClassName: User
 * Package: Object.Equals
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/20 16:16
 * @Version 1.0
 */
public class User {
    private String host;
    private String username;
    private String password;
    public User(String host,String username,String password){
        super();
        this.host = host;
        this.password = password;
        this.username = username;
    }

    public User(){
        super();
    }

    public String getHost() {
        return host;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "User [host = " + host +",username = "+username +",password = "+password +"]";
    }



    @Override
    public boolean equals(Object obj) {
        //判断是否是同一个对象
        //自引用检查
        //自反性
        //最优性能
        if (this == obj)
            return true;
        //判断传入的对象是否是null
        //非空性
        if (obj == null)
            return false;
        //判断两个对象的类是否相同
        //确保可以进行安全的向下转移
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (host == null) {
            if (other.host != null)
                return false;
        } else if (!host.equals(other.host))
            return false;

        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;

        if (username == null) {
            //可以进行true的判断
            //但是为了保持形式一致
            return other.username == null;
        } else return username.equals(other.username);
    }
}
