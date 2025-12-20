package Object.clone;

/**
 * ClassName: Animal
 * Package: Object.clone
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/20 18:36
 * @Version 1.0
 */
public class Animal implements Cloneable{
    private String name;

    public Animal(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Animal [name = "+name + "]";
    }

    /*@Override
    protected Object clone() throws CloneNotSupportedException{
        //TODO Auto-
    }*/
}
