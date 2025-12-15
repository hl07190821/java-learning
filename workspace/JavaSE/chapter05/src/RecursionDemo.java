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

        System.out.println(new RecursionDemo().mutiply(5));

        System.out.println(recursionDemo.f1(3));

        System.out.println(recursionDemo.fibonacciTest1(5));

        System.out.println(recursionDemo.fibonacciTest2(5));
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

    public int mutiply(int num){
        if (num == 1){
            return 1;
        }else{
            return num*mutiply(num-1);
        }
    }

    /**
     * 已知有一个数列：f(0) = 1，f(1) = 4，f(n+2)=2*f(n+1) + f(n)，其中n是大于0的整数，求f(10)的值。
     * 转换为f(n) = 2*f(n-1) + f(n-2)
     */
    public int f1(int num){
        if(num == 0){
            return 1;
        }else if(num == 1){
            return 4;
        }else{
            return 2*f1(num-1)+f1(num-2);
        }
    }

    /**
     *已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n)，其中n是大于0的整数，求f(10)的值。
     * 转换为f(n) = f(n+2) - 2*f(n+1)
     */
    public int f2(int num){
        if (num == 20){
            return 20;
        } else if (num == 21) {
            return 21;
        }else{
            return f2(num+2) - 2*f2(num+1);
        }
    }

    /**
     * 计算斐波那契数列（Fibonacci）的第n个值，斐波那契数列满足如下规律
     * 1,1,2,3,5,8,13,21,34,55,....
     * 从第三个数开始，f(n) = f(n-2) + f(n-1)
     */
    //使用递归
    public int fibonacciTest1(int num){
        if(num == 0){
            return 1;
        } else if (num == 1) {
            return 3;
        }else {
            return fibonacciTest1(num-1) + fibonacciTest1(num-2);
        }
    }
    //不使用递归
    public int fibonacciTest2(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else if (num >= 3) {
            int before = 1;
            int beforeBefore = 1;
            int current = 2;
            for (int i = 1; i <= num - 3; i++) {
                beforeBefore = before;
                before = current;
                current = before + beforeBefore;
            }
            return current;
        } else {
            return 1;
        }
    }

    //测试递归调用的次数
    /**
     * T(0) = 1
     * T(1) = 1 + T(0) + T(-1) = 1 + 1 + 1 = 3
     * T(2) = 1 + T(1) + T(0) = 1 + 3 + 1 = 5
     * T(3) = 1 + T(2) + T(1) = 1 + 5 + 3 = 9
     * T(4) = 1 + T(3) + T(2) = 1 + 9 + 5 = 15
     * T(5) = 1 + T(4) + T(3) = 1 + 15 + 9 = 25
     * T(6) = 1 + T(5) + T(4) = 1 + 25 + 15 = 41
     * T(7) = 1 + T(6) + T(5) = 1 + 41 + 25 = 67
     * T(8) = 1 + T(7) + T(6) = 1 + 67 + 41 = 109
     * T(9) = 1 + T(8) + T(7) = 1 + 109 + 67 = 177
     * T(10) = 1 + T(9) + T(8) = 1 + 177 + 109 = 287
     */
    private int count = 0;
    public int recursion(int k){
        count++;
        System.out.println("count:"+count+" k:"+k);

        if(k <= 0){
            return 0;
        }
        return recursion(k-1) + recursion(k-2);
        //return recursion(k-1);//d迭代调用11次
        //return recursion(k-1) + recursion(k-1);//迭代调用2047次

    }
}
