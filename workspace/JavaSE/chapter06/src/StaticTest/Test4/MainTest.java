package StaticTest.Test4;

/**
 * ClassName: MainTest
 * Package: StaticTest.Test4
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/16 15:45
 * @Version 1.0
 */

/**
 * 1,由于JVM需要调用类的main方法，所以该方法的访问权限必须使public
 * 2，又因为JVM在执行main（）方法时不必创建对象，所以该方法必须是static
 * 3，该方法接受一个String类型的数组参数，该数组中保存执行Java命令时传递给所运行的类的参数
 * 4，又因为main（）方法是静态的，我们不能直接访问类中的非静态成员，必须创建该类的一个实例对象后
 * 才能通过这个对象去访问类中的非静态成员
 */

public class MainTest {
    public int num = 1;

    public static void main(String[] args) {
        //可以通过创建实例来访问非静态成员
        System.out.println(new MainTest().num);

        for(int i = 0;i < args.length;i++){
            System.out.println("args[" + i + "]" + args[i]);
        }
    }
}

