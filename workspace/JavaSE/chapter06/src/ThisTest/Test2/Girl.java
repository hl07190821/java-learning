package ThisTest.Test2;

/**
 * ClassName: Girl
 * Package: ThisTest.Order
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 18:01
 * @Version 1.0
 */
public class Girl {
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

    public Girl(){}

    public Girl(Boy boy){
        System.out.println();
        //报错，this();只能声明在构造器的首行
    }
}
