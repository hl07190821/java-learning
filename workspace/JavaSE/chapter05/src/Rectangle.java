/**
 * ClassName: Rectangle
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/14 17:02
 * @Version 1.0
 */

public class Rectangle {

    double length;
    double width;

    /**
     * 返回本矩形对象的面积
     */
    public double area(){
        return length*width;
    }
    /**
     * 返回矩形对象的周长
     */
    public double perimeter(){
        return length*2 + width*2;
    }

    /**
     * 返回对象的详细信息
     */
    public String getInfo(){
        return "length:"+length+
                ",width:"+width+
                //直接调用方法
                ",area:"+area()+
                ",perimeter"+perimeter();
    }
}
