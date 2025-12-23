package conflict.InterfaceConflict2;

/**
 * ClassName: Ball
 * Package: conflict.InterfaceConflict2
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 21:20
 * @Version 1.0
 */
public class Ball implements Rollable{
    private String name;

    public Ball(String name){
        this.name= name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        //ball = new Ball("Football");
        System.out.println(ball.getName());

    }

}
