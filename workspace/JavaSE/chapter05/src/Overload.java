/**
 * ClassName: mOL
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/14 17:29
 * @Version 1.0
 */
public class Overload {
    public int mOL(int x){
        return x*x;
    }

    public int mOL(int x,int y){
        return x*x + y*y;
    }

    public String mOL(String x){
        return x;
    }

    public int max(int x,int y){
        return x>y ? x:y;
    }

    public double max(double x,double y){
        return x>y ? x:y;
    }

    public double max(double x,double y,double z){
        //嵌套第二个max
        return max(max(x,y),z);
    }

    public int max(int... nums){

        int max = nums[0];

        for (int i = 0;i < nums.length;i++){
            max = nums[i] > max ? nums[i] : max;
        }
        return max;
    }

    /*不会报错，但是调用时，会引起多个方法同时匹配
    public int max(int first,int...nums){
        int max = first;

        for (int i = 0;i < nums.length;i++){
            max = nums[i] > max?nums[i] : max;
        }
        return max;
    }*/
}
