package TypeConversion.Test6;

/**
 * ClassName: Circle
 * Package: TypeConversion.Test6
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/18 17:14
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
        /*super.setColor(color);
        super.setWeight(weight);*/
    }

    @Override
    public double findArea() {
        return 3.14*radius*radius;
    }
}
