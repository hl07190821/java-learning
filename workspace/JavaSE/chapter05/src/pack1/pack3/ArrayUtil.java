package pack1.pack3;

/**
 * ClassName: ArrayUtil
 * Package: pack1.pack3
 * Description:
 *
 * @author Soon
 * @create  2025/12/15 19:21
 * @Version 1.0
 */
public class ArrayUtil {
    /**
     *
     * @Description 求int型数组的最大值
     * @author Soon
     * @param arr
     * @return
     */
    public int max(int[] arr){
        int maxValue = arr[0];
        for (int i = 1;i < arr.length;i++){
            maxValue = maxValue > arr[i] ? maxValue : arr[i];
        }
        return maxValue;
    }

    /**
     *
     * @Description 求int数组的最小值
     * @author Soon
     * @param arr
     * @return
     */
    public int min(int[] arr){
        int minValue = arr[0];
        for (int i = 0;i < arr.length;i++){
            minValue = minValue < arr[i] ? minValue:arr[i];
        }
        return minValue;
    }

    /**
     *
     * @Description 求int类型数组的总和
     * @author Soon
     * @param arr
     * @return
     */
    public int sum(int[] arr){
        int sum = arr[0];
        for (int i = 1;i < arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    /**
     *
     * @Description 求int型数组的元素的平均值
     * @author Soon
     * @param arr
     * @return
     */
    public int avg(int[] arr){
        int sumValue = sum(arr);
        return sumValue/arr.length;
    }

    /**
     * 创建一系列重载的上述方法
     * public double max(double[] arr)
     * public float max(float[] arr)
     * public byte max(byte[] arr)
     */

    /**
     *
     * @Decription 遍历数组
     * @author Adam
     * @param arr
     */
    public void print(int[] arr){
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     *
     * @Description 复制数组arr
     * @author Adam
     * @param arr
     * @return
     */
    public int[] copy(int[] arr){
        //在堆内new一个数组
        int[] arr1 = new int[arr.length];
        for (int i = 0;i < arr.length;i++){
            arr1[i] = arr[i];
        }
        return arr1;
    }

    /**
     *
     * @Description 反转数组
     * @author Adam
     * @param arr
     */
    public void reverse(int[] arr){
        for (int i = 0, j = arr.length-1;i < j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /**
     *
     * @Description 数组的排序
     * @author Adam
     * @param arr
     * @param desc 知名排序的方式， ascend：升序  descend：降序
     */
    public void sort(int[] arr ,String desc){
        //升序
        if ("ascend".equals(desc)){
            for (int i = 0;i < arr.length-1;i++){
                for(int j = 0;j < arr.length-1-i;j++){
                    if (arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        //降序
        }else if("descend".equals(desc)){
            for(int i = 0;i < arr.length-1;i++){
                for (int j = 0;j < arr.length-1-i;j++){
                    if (arr[j] < arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }else {
            System.out.println("您输入的排序方式有误！");
        }
    }

    private void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     *
     * @Description 查找指定的value值在arr数组中出现的位置
     * @author Adam
     * @param arr
     * @param value
     * @return 返回value值出现的位置 或 -1：未找到
     */
    public int gerValue(int[] arr,int value){
        for (int i = 0;i < arr.length;i++){
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }
}
