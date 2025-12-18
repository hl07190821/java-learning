package TypeConversion.Test3;

/**
 * ClassName: Son
 * Package: TypeConversion.Test3
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/18 16:15
 * @Version 1.0
 */
public class Son extends Father{
    private String info = "尚硅谷";

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void test(){
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }
}
