package TypeConversion.Test6;

/**
 * ClassName: GeometricTest
 * Package: TypeConversion.Test6
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/18 17:24
 * @Version 1.0
 */
public class GeometricTest {
    public static boolean equalsArea(GeometricObject geometricObject1,GeometricObject geometricObject2){
        return geometricObject1.findArea()== geometricObject2.findArea();
    }

    public static void displayGeometricObject(GeometricObject geometricObject){
        System.out.println("Area:"+geometricObject.findArea());
    }

    public  static void main(String[] args) {
        GeometricObject g1 = new Circle(1,"红",1);
        GeometricObject g2 = new MyRectangle(2,3,"红",2);
        System.out.println(equalsArea(g1,g2));
        displayGeometricObject(g1);
        displayGeometricObject(g2);
    }
}
