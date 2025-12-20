package Object.toString;

/**
 * ClassName: GeometricObject
 * Package: Object.toString
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/20 18:23
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(){
        this.color = "color";
        this.weight = 1.0;
    }

    protected GeometricObject(String color,double weight){
        this.color = color;
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

}
