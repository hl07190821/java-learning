package Object.toString;

/**
 * ClassName: Circle
 * Package: Object.toString
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/20 18:26
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private final double radius;

    public Circle(){
        super();
        this.radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
    }

    public double findArea(){
        return 3.14*radius*radius;
    }
    @Override
    public boolean equals(Object object){
        if (this == object)
            return false;
        if (object == null)
            return false;
        if (this.getClass() != object.getClass())
            return false;

        Circle other = (Circle)object;
        return radius == other.radius;
    }

    @Override
    public String toString(){
        return ""+radius;
    }
}
