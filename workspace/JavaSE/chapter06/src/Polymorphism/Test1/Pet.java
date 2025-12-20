package Polymorphism.Test1;

/**
 * ClassName: Pet
 * Package: Polymorphism.User
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/17 20:34
 * @Version 1.0
 */
public class Pet {
    private String nickname;

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public void eat(){
        System.out.println(nickname + "吃东西");
    }

}
