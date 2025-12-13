/**
 * ClassName: Game
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/13 20:04
 * @Version 1.0
 */
public class Game {
    public static void main(String[] args) {
        Person p = new Person();
        //通过Person对象调用属性
        p.name = "康师傅";
        p.gender = '男';
        //创建Person对象的dog实例
        p.dog = new Dog();

        //给Person对象的dog实例赋值
        p.dog.type = "柯基犬";
        p.dog.nickName = "小白";

        //通过Person对象调用方法
        p.feed();

        /*匿名对象
        当创建对象时
        成员变量的初始值为null
        byte short int long:0
        float double:0.0
        char:'\u0000'
        boolean:false*/

        //new Person().feed();//报错 break pointer

        new Dog().eat();//成功运行

    }
}
