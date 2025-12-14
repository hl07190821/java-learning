/**
 * ClassName: PassObject
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/14 18:55
 * @Version 1.0
 */
public class PassObject {

    public static void main(String[] args) {
        int time = 5;
        Circle C = new Circle();
        //只有将方法改成静态，才能在直接调用同一个类中的另一个方法
        printArea(C,time);
        System.out.println("now radius is:"+C.radius);
    }

    public static void printArea(Circle C,int time){
        System.out.println("Radius"+"\t\t\t"+"Area");
        //for(int i = 1,C.radius = 1.0报错
        //for循环的初始化部分只能声明类型相同的变量
        for (int i = 1;i <= time;i++,C.radius++){
            System.out.print(i+"\t\t\t\t");

            System.out.println(C.findArea());
        }
    }
}
