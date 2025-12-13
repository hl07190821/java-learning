/**
 * ClassName: MethodInvokeDemo
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/13 22:20
 * @Version 1.0
 */
public class MethodInvokeDemo {
    public static void main(String[] args) {
        //创建对象
        MethodDefineDemo md = new MethodDefineDemo();

        System.out.println("---------方法调用演示---------");

        //调用MethodDefineDemo类中无参无返回值sayHello
        md.sayHello();
        md.sayHello();
        md.sayHello();
        //调用一次，执行一次，不调用不执行

        System.out.println("----------------------------");
        //调用MethodDefineDemo类中有参无返回值的方法printRectangle
        md.printRectangle(5,10,'@');

        System.out.println("-----------------------------");
        //调用MethodDefineDemo类无参有返回值的方法getIntBetweenOneToHundred
        md.getIntBetweenOneToHundred();//语法没问题，就是结果丢失

        int num = md.getIntBetweenOneToHundred();
        System.out.println("num = "+num);

        //创建匿名对象，调用匿名对象中的方法
        System.out.println(new MethodDefineDemo().getIntBetweenOneToHundred());
        //上面代码调用了getIntBetweenOneToHundred三次，这个方法执行了三次

        System.out.println("-----------------------------");
        //调用MethodDefineDemo类中有参无返回值的方法max
        md.max(3,6);//语法没问题，但是结果丢失

        int bigger = md.max(3,6);
        System.out.println("bigger = "+ bigger);

        System.out.println("8,3中较大者是：" + new MethodDefineDemo().max(3,8));

    }
}
