package conflict.InterfaceConflict2;

/**
 * ClassName: Rollable
 * Package: conflict.InterfaceConflict2
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 21:18
 * @Version 1.0
 */
public interface Rollable extends Bounceable,Playable{
    //父接口的抽象若发生冲突
    //在子接口若不重写并不会报错


    //静态变量的final也是隐藏的
    Ball ball = new Ball("PingPong");
}
