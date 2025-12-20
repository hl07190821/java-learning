package Object.finalize;

/**
 * ClassName: Person
 * Package: Object.finalize
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/20 18:44
 * @Version 1.0
 */
public class Person {
    private String name;
    private int age;

    public Person(){}
    public Person(String name,int age){
        super();
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    //子类重写此方法，可在释放对象前进行某些操作
    @Override
    protected void finalize() throws Throwable{
        System.out.println("对象被释放-->"+this);
    }

    @Override
    public String toString(){
        return "Person [name = "+ name + ",age = "+age+"]";
    }
}
