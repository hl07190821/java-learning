package TypeConversion.Test6;

/**
 * ClassName: MyRectangle
 * Package: TypeConversion.Test6
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/18 17:18
 * @Version 1.0
 */
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public MyRectangle(double width,double height,String color,double weight){
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    @Override
    public double findArea() {
        return width*height;
    }
}
