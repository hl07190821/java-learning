package pack1.pack2;
//import pack1.pack2.test1; 因为test1与test2在同一个包，因此可以省略
import pack1.pack3.test1;
//import pack1.pack4.test1;命名冲突，使用全类名
/**
 * ClassName: test2
 * Package: pack1.pack2
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/15 13:31
 * @Version 1.0
 */
public class test2 {

   test1 i = new test1();

   //如果同包中有test1 并且导入的包中也有test1 优先使用导入包中的test1
   static test1 test = new test1();

    pack1.pack3.test1 pack3test1 = new pack1.pack3.test1();

    public static void main(String[] args) {
        //静态方法只能访问静态变量
        System.out.println(test);
    }

    public void demo(){
        //pack3.test1优先级更高，同时由于pack.test1中没有test1属性，因此报错
        test1 i = new test1();
        if(i == null){
            System.out.println();
        }
    }
}
