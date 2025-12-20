package ThisTest.Test2;

/**
 * ClassName: Boy
 * Package: ThisTest.Order
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 18:01
 * @Version 1.0
 */
public class Boy {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    private int age;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public Boy(){}

    public Boy(Girl girl){
        this();
    }



}
