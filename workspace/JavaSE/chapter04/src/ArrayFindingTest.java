/**
 * ClassName: ArrayFindingTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/12 17:09
 * @Version 1.0
 */
//顺序查找
class ArrayFindingTest {
    //查找value第一次在数组中出现的index
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int value = 1;
        int index = -1;

        for (int i = 0;i<arr.length;i++){
            index++;
            if(arr[i] == value){
                break;
            }
        }
        System.out.println("值"+value+"第一次出现的索引为："+index);
    }
}

//二分查找
//要求数组必须是有序的
class ArrayFindingTest01{
    public static void main(String[] args) {
        int[] arr={1,3,5,6,8,9,13,15,17,18,20,23,25};
        int value = 30;
        //设定头部边界下标和尾部边界下标
        int head = 0,end = arr.length-1;
        //设置索引
        int index = 0;
        //head等于end是为了进行边界检查
        //此处，必定不为死循环
        while (head<=end){
            int mid = (head+end)/2;
            if(arr[mid]==value){
                index = mid;
                System.out.println("找到指定的元素的索引："+mid);
                break;
            } else if (arr[mid]>value) {
                //value在中位数的左侧，改变尾部边界下标
                end = mid-1;
            } else if (arr[mid]<value) {
                //value在中位数的右侧，改变头部边界下标
                head = mid+1;
            }
        }
        if(head>end){
            System.out.println("没有找到指定的元素");
        }
    }
}