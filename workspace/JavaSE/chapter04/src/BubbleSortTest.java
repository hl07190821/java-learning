/**
 * ClassName: BubbleSortTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/12 17:32
 * @Version 1.0
 */
/*冒泡排序思想：
        - 比较相邻的元素。如果第一个比第二个大（升序），就交换他们两个。

        - 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。

        - 针对所有的元素重复以上的步骤，除了最后一个。

        - 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较为止*/
class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = {1,3,9,5,3,6,7,9,10};

        //一共要进行length-1次循环比较
        for(int i = 1;i<arr.length;i++){
            //进行比较
            for(int j = 0;j< arr.length-i;j++){
                //两两比较，如果第一个比第二个大就交换他们的元素
                if(arr[j]>arr[j+1]){
                    //交换
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("排序后的数组为：");
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}

//冒泡排序优化
//如果有一遍循环没有发生交换，直接结束循环
class BubbleSortTest2{
    public static void main(String[] args) {
        //只需要进行一次循环
        int[] arr = {1,9,2,3,4,5,6,8};

        for (int i =1;i<arr.length;i++){
            //在每轮循环的开始，设置为true
            boolean flag = true;
            for (int j = 0;j< arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    //若发生交换，则说明还没有排好序
                    flag = false;
                }
            }
            //flag=true，则说明没有发生交换，排序完成
            if(flag){
                break;
            }
        }

        System.out.println("排序完成之后的数组为：");
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
