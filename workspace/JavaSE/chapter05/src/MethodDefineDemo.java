/**
 * ClassName: MethodDefineDemo
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/13 22:04
 * @Version 1.0
 */
public class MethodDefineDemo {
    public static void main(String[] args) {
        //注意char类型实参形式为‘*’
        int area = new MethodDefineDemo().PrintRectangle01(10,8,'*');

        System.out.println("面积为："+area);
    }
    /**
     * 无参无返回值
     */
    public void sayHello(){
        System.out.println("Hello");
    }
    /**
     * 有参无返回值
     * @param length int 第一个参数，表示矩形的长
     * @param width int 第二个参数，表示矩形的宽
     * @param sign char 第三个参数，表示填充矩形图形的符号
     */
    public void printRectangle(int length,int width,char sign){
        for (int i = 1; i <= length; i++){
            for (int j = 1; j <= width; j++){
                System.out.print(sign);
            }
            System.out.println();
        }
    }
    /**
     * 无参有返回值
     * @return
     */
    public int getIntBetweenOneToHundred(){
        return (int)(Math.random()*100+1);
    }
    /**
     * 有参数有返回值
     * @param a int 第一个参数，要比较大小的整数之一
     * @param b int 第二个参数，要比较大小的整数之一
     * @return int 比较大小的两个整数中较大者的值
     */
    public int max(int a,int b){
        return a > b ? a : b;
    }

    //打印*矩形
    public int PrintRectangle01(int length,int width,char sign){
        for(int i = 1;i <= width;i++){
            for (int j = 1; j <= length;j++){
                System.out.print(sign);
            }
            System.out.println(sign);
        }

        return length*width;
    }
}
