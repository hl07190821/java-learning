package interfacetest.implementstest;

/**
 * ClassName: InterfaceDemo
 * Package: interfacetest.implementstest
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/22 12:46
 * @Version 1.0
 */
public class InterfaceDemo{
    public static void main(String[] args){
        //接口与实现类对象构成多态引用
        Computer.show(new Flash()) ;
        Computer.show(new Print()) ;

        /**
         * 匿名内部类
         * 匿名内部类是Java中的一种特殊的内联类，用于一次性创建接口或抽象类的实现，不需要显式定义一个类名
         * 相当于：
         * 1，定义了一个没有名字的类。实现了USB接口
         * 2，同时创建了这个匿名类的实例
         * 格式为
         * new USB(){
         *     public void start(){
         *         sout;
         *     }
         *     public void stop(){
         *         sout;
         *     }
         * }
         */
        Computer.show(new USB(){
            public void start(){
                System.out.println("移动硬盘开始运行");
            }
            public void stop(){
                System.out.println("移动硬盘停止运行");
            }
        }
        );
    }
}
