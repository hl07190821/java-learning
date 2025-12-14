/**
 * ClassName: PrintStream
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/14 17:20
 * @Version 1.0
 */
/**
 * 方法重载：在同一个类中允许存在一个以上的同名方法，只要他们的参数列表不通过即可
 * 重载的特点：与修饰符，返回值类型都无关，只看参数列表，且参数列表必须不同（参数个数或者参数类型），调用时。，根据方法参数列表来区别
 * 重载方法调用：JVM通过方法的参数列表，调用匹配的方法
 * 1，先找个数，类型最匹配的
 * 2，再找个数和类型可以兼容的，如果同时多个方法可以兼容将会报错
 */

public class PrintStream {
    public void println(byte x){}

    public void println(short x){}

    public  void  println(int x){}

    public  void  println(long x){}

    public  void  println(float x){}

    public  void  println(double x){}

    public void  println(char x){}

    public void  println(){}

    public void println(int a,char b,double c){}

    public void println(int a, double c,char b){}
}


