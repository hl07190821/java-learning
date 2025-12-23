package conflict.InterfaceConflict;

/**
 * ClassName: BoyFriend
 * Package: conflict.InterfaceConflict
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/23 20:13
 * @Version 1.0
 */
public interface BoyFriend {
    default void date(){
        System.out.println("神秘约会");
    }
}
