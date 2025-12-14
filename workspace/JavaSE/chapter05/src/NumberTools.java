/**
 * ClassName: NumberTools
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/14 17:58
 * @Version 1.0
 */
public class NumberTools {
    public int total(int[] nums){
        int sum = 0;
        for (int i = 0;i<nums.length;i++){
            sum += nums[i];
        }
        return sum;
    }
    public int sum(int... nums){
        int sum = 0;
        for (int i = 0; i<nums.length;i++){
            sum += nums[i];
        }
        return sum;
    }
}
