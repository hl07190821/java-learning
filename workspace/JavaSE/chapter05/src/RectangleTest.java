/**
 * ClassName: RectangleTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/14 17:13
 * @Version 1.0
 */
public class RectangleTest {
    public static void main(String[] args) {

        //rectangles 指向堆中引用类型数组的首地址
        //而引用类型数组中存储着各个对象的首地址
        Rectangle[] rectangles = new Rectangle[3];

        for (int i = 1;i<=rectangles.length;i++ ){
            rectangles[i-1] = new Rectangle();
            rectangles[i-1].length = 10*i;
            rectangles[i-1].width = 5*(2*i-1);
            System.out.println(rectangles[i-1].getInfo());
        }

       /* for (int i = 0;i < rectangles.length;i++){
            System.out.println(rectangles[i].getInfo());
        }*/
    }
}
