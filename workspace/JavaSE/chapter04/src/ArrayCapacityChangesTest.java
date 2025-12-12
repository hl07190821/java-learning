/**
 * ClassName: ArrayCapacityChangesTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/12 16:30
 * @Version 1.0
 */
//数组扩容
class ArrayCapacityExpansionTest {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};

        //左移1位相当于乘2
        int[] newArr = new int[arr.length<<1];

        //赋值
        for (int i =0;i< arr.length;i++){
            newArr[i] = arr[i];
        }

        newArr[arr.length] = 10;
        newArr[arr.length+1] = 20;
        newArr[arr.length+2] = 30;

        //指向同一个地址
        arr = newArr;
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}

//数组缩容
//现有数组 int[] arr={1,2,3,4,5,6,7}。现需删除数组中4的元素。
class ArrayCapacityShrinkTest{
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        //设定计数器
        int count = 0;

        //确定要缩小容量的个数，即元素4的个数
        for (int i = 0;i<arr.length;i++){
            count = arr[i]==4 ? 1:count;
        }
        //创建镜像数组
        int[] newArr = new int[arr.length-count];

        //将原数组中的元素迁移
        //temp记录镜像数组索引
        for (int i = 0,temp = 0;i< arr.length;i++,temp++){
            if (arr[i]!=4){
                newArr[temp] = arr[i];
            } else{
                //发现当前arr[i]==4,就跳过，并重新设置镜像数组索引
                temp--;
            }
        }
        arr = newArr;

        System.out.println("缩容之后：");
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}

//删除时数组中索引为4的元素
class Test{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int delIndex = 4;
       /* //方案一，创建新数组
        int[] newArr = new int[arr.length-1];
        for (int i = 0;i<delIndex;i++){
            newArr[i] = arr[i];

        }
        for (int i = delIndex;i< newArr.length;i++){
            newArr[i] = arr[i+1];
        }
        arr = newArr;*/

        //方案二
        //arr.length-1
        for (int i = delIndex;i< arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        //将最后一个元素归零
        arr[arr.length-1] = 0;
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

    }
}
