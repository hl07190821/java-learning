/**
 * ClassName: ArrayTypeParam
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/14 18:36
 * @Version 1.0
 */
public class ArrayTypeParam {

    //冒泡排序，实现数组从小到大排序
    public void sort(int[] arr){
        for (int i = 1; i<arr.length;i++){
            for (int j = 0;j<arr.length-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //打印数组的元素
    public void print(int[] arr){
        for (int i =1; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        ArrayTypeParam arrayTypeParam = new ArrayTypeParam();

        int[] arr = {1,5,74,6,74,7};

        arrayTypeParam.print(arr);

        arrayTypeParam.sort(arr);

        arrayTypeParam.print(arr);


    }
}
