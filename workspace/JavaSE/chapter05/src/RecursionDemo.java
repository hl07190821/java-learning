/**
 * ClassName: RecursionDemo
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/14 19:33
 * @Version 1.0
 */
public class RecursionDemo {
    public static void main(String[] args) {
        RecursionDemo recursionDemo = new RecursionDemo();
        //计算1~num的和，使用递归完成
        int num = 5;
        //调用求和的方法
        int sum = recursionDemo.getSum(num);
        //输出结果
        System.out.println(sum);
    }

    /**
     * 通过递归算法实现求和
     */
    public int getSum(int num){
        if(num == 1){
            //递归结束
            return 1;
        }
        return num + getSum(num-1);
    }
}
