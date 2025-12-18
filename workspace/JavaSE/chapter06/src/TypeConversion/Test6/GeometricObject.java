package TypeConversion.Test6;

/**
 * ClassName: GeometricObject
 * Package: TypeConversion.Test6
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/18 17:11
 * @Version 1.0
 */
public class GeometricObject {
    private String color;
    private double weight;

    public GeometricObject(String color,double weight){
        this.color = color;
        this.weight = weight;
    }

    public GeometricObject(){}

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea(){
        return weight;
    }
}
