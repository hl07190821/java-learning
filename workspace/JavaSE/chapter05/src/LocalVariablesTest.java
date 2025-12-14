/**
 * ClassName: LocalVariablesTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/14 18:14
 * @Version 1.0
 */
public class LocalVariablesTest {

    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        Date date = new Date();
        date.m = 10;
        date.n = 20;
        String m1 = "hello";
        String n1 = "world";
        System.out.println("m:"+m);
        System.out.println("n:"+n);
        System.out.println(m1+n1);
        System.out.println(System.identityHashCode(m1));
        System.out.println(System.identityHashCode(n1));
        System.out.println(date.m);
        System.out.println(date.n);


        LocalVariablesTest tools = new LocalVariablesTest();

        tools.swap(m,n);
        tools.swap(m1,n1);
        tools.swap(date);

        System.out.println("m:"+m);
        System.out.println("n:"+n);
        System.out.println(m1+n1);
        System.out.println(System.identityHashCode(m1));
        System.out.println(System.identityHashCode(n1));
        System.out.println(date.m);
        System.out.println(date.n);
    }


    public void swap(int m,int n){
        int temp = m;
        m = n;
        n = temp;
    }

    public void swap(String m,String n){
        //交换前地址
        System.out.println(System.identityHashCode(m));
        System.out.println(System.identityHashCode(n));
        String temp = m;
        m = n;
        n = temp;
        //交换后地址
        System.out.println(System.identityHashCode(m));
        System.out.println(System.identityHashCode(n));
    }

 /*   public void swap(Date date){
        int temp = date.m;
        date.m = date.n;
        date.n = temp;
    }*/

    public void swap(Date date){
        //依然指向同一个地址
        //直接对堆中的对象属性进行修改
        Date newDate = date;
        int temp = newDate.m;
        newDate.m = newDate.n;
        newDate.n = temp;

    }


}

class Date{
    int m;
    int n;
}
