/**
 * ClassName: ArrayReverseTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/12 16:15
 * @Version 1.0
 */
//首尾对应位置交换
class ArrayReverseTest {
    public static void main(String[] args) {

        int[] arr = new int[]{1,3,4,5,6,6};
        System.out.println("反转之前：");

        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        //反转
        //反转次数不用额外声明变量
        //注意，小于<arr.length
        for (int i = 0;i < arr.length/2;i++){
            //注意首位索引相加应该为 arr.length-1
            arr[i] = arr[i] + arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i] - arr[arr.length-1-i];
            arr[i] = arr[i] - arr[arr.length-1-i];
        }

        System.out.println("反转之后：");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");

        }
    }
}

//左右对应位置交换
class ArrayReverseTest1{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        System.out.println("反转之前：");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        //设置左右坐标
        for(int left = 0,right = arr.length-1;left < right;left++,right--){
            arr[left] = arr[left] + arr[right];
            arr[right] = arr[left] - arr[right];
            arr[left] = arr[left] - arr[right];
        }

        System.out.println("反转之后：");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

    }
}
