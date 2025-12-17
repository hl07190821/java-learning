package InheritTest.Test1;

/**
 * ClassName: Cylinder
 * Package: InheritTest.Usage1
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 22:31
 * @Version 1.0
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder(){
        //如果子类构造器没有显式调用父类构造器，编译器会自动在子类构造器第一行添加super（）,
        //即隐式调用父类的无参构造器
        length = 1.0;
    }

    public void setLength(double l ){
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public double findVolume(){
        //子类只能通过方法访问私有化属性
        return 3.14*this.getRadius()*getRadius()*length;
    }



}
