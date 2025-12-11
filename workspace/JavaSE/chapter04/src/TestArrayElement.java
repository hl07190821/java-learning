/**
 * ClassName: TestArrayElement
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/10 21:46
 * @Version 1.0
 */

//求总和均值
class TestArrayElementSum {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,9};
        //设定总和为0
        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
        }
        //设定均值
        //强制类型转换，不然就是整数除法
        double avg = (double)sum/ arr.length;

        System.out.println("sum = "+sum);
        System.out.println("avg = "+avg);
    }
}

//求数组元素的总乘积
class TestArrayElementMul{
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,9};

        //求总乘积
        //因为1乘任何数都不影响结果
        long result = 1L;
        for(int i = 0; i< arr.length;i++){
            result *= arr[i];
        }
        System.out.println("result = "+result);
    }
}

//求数组中偶数的个数
class TestArrayElementEvenCount{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //记录偶数的个数
        int evenCount = 0;
        for (int i = 0;i< arr.length;i++){
            if(arr[i]%2 == 0){
                evenCount++;
            }
        }
        System.out.println("evenCount："+evenCount);
    }
}

//求数组元素的最大值
class TestArrayElementMax{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //设定初始最大值为数组第一个元素
        int max = arr[0];
        for (int i = 1;i< arr.length;i++){
            max = arr[i] > max ? arr[i]:max;
        }
        //可视化
        System.out.println("element max:"+max);
    }
}

//找最大值及其第一次出现的下标
class TestArrayElementMaxIndex{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        //设定最大值初始值
        int max = arr[0];
        //设定下标初始值
        int index = 0;
        for (int i = 1;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("max = "+max+",index = "+index);
    }
}


//* * *找出最值及其所有最值的下标
class TestAllArrayElementMaxIndex{
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,4,5,6,6};

        /*
        //寻找最大值
        int max = arr[0];
        for (int i = 1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最大值是："+max);
        System.out.print("最大值的下标有：");

        //遍历数组，看哪些元素和最大值是一样的
        for (int i = 0;i < arr.length;i++){
            if(max == arr[i]){
                System.out.println(i+"\t");
            }
        }
        System.out.println();

         */
        //代码优化
        //设置最大值
        int max = arr[0];
        //设置下标初始值为0
        String index = "0";
        for (int i = 1;i< arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
                //如果数组中有元素大于第一个元素，那么改变下标初始值
                //同时，若先进行else if导致index中有多个下标，也可以一次性重置
                index = i+" ";
            } else if (arr[i]==max) {
                //连加
                index +=","+i;
            }
        }
        System.out.println("最大值是"+max);
        System.out.println("最大值的下标是["+index+"]");
    }
}

//* * * *整形数组和子数组
/*      输入一个整形数组，数组里有正数也有负数。
        数组中连续的一个或多个整数组成一个子数组，
        每个子数组都有一个和。求所有子数组的和的最大值*/
class TestSonArray{
    public static void main(String[] args) {
        int[] arr = new int[]{2,-2,3,-1,-2,-10,-3,-9};
        int i = getGreatestSum(arr);
        System.out.println(i);

    }

    public static int getGreatestSum(int[] arr){
        int greatestSum = 0;
        if(arr == null || arr.length ==0){
            return 0 ;
        }
        int temp = greatestSum;
        //假设至少有一个正数
        for(int i = 0;i<arr.length;i++){
            temp += arr[i];

            //若temp小于0，则会拖累后续的求和，因此舍去
            if(temp < 0){
                temp = 0;
            }
            if(temp >greatestSum){
                greatestSum = temp;
            }
        }
        //若全为负数，但是greatestSum = 0
        if(greatestSum == 0){
            greatestSum = arr[0];
            for (int i = 1;i<arr.length;i++){
                if (greatestSum < arr[i]){
                    greatestSum = arr[i];
                }
            }
        }
        return greatestSum;
    }
}

// * 评委打分
/*分析以下需求，并用代码实现：

        （1）在编程竞赛中，有10位评委为参赛的选手打分，分数分别为：5，4，6，8，9，0，1，2，7，3

        （2）求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值）*/
class TestArray06{
    public static void main(String[] args) {
        int[] arr = {5,4,6,9,0,1,2,7,3};
        int maxScore = arr[0];
        int minScore = arr[0];
        int sumScore = 0;
        //找到最高分和最低分
        for(int i = 0;i<arr.length;i++){

            sumScore += arr[i];

            if(maxScore<arr[i]){
                maxScore = arr[i];
            }
            if (minScore>arr[i]){
                minScore = arr[i];
            }

        }
        //同时，减去最高分和最低分你
        sumScore -= (maxScore+minScore);
        //强制类型转换sunScore
        //整个算式中有double型就不算是整数除法
        double finalScore = (double)sumScore/(arr.length-2);

        System.out.println("最终成绩为："+finalScore);
    }
}

//一个数组，让数组的每个元素去除第一个元素，得到的商作为被除数所在位置的新值
class TestArray07{
    public static void main(String[] args) {
        double[] arr = new double[]{12,43,65,3,-8,64,2};

        //错误，第一个元素开始除
        /*for (int i = 0;i< arr.length;i++){
            arr[i] = arr[i]/arr[0];
        }*/
        //从最后一个元素开始运算
        for (int i = arr.length-1;i>=0;i--){
            arr[i] = arr[i]/arr[0];
        }
        //遍历
        for (int i = 0;i< arr.length;i++){
            System.out.println(arr[i]+"\t");
        }
    }
}

// * * *创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。同时，要求元素的值各不相同
class TestArray08{
    public static void main(String[] args) {
        int[] arr = new int[6];

        //分别为每个位置赋值
        for(int i = 0;i< arr.length;i++) {

            arr[i] = (int)(Math.random()*30)+1;
            //使用while-for嵌套，进行无限的有限循环
            l:while(true) {
            //for循环全部遍历一边再break，否则continue
                for(int j=0;j<i;j++) {
                    if (arr[j] == arr[i]){
                        arr[i] = (int)(Math.random()*30)+1;
                        //结束本次while循环
                        continue l;
                    }
                }
                break ;
            }
//            System.out.println(arr[i]+"\t");
        }
    }
    //更优的方法
    public void test2(){
        int[] arr = new int[6];

        for (int i = 0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*30)+1;
            for(int j = 0; j<i;j++){
                if(arr[j]==arr[i]){
                    //*****让整个大循环重新走一遍
                    i--;
                    //直接结束小循环
                    break;
                }
            }
        }
        //上一个嵌套循环的变式
        for (int i = 0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*30)+1;
            for(int j = 0;j<i;j++){
                if(arr[i]==arr[j]){
                    arr[i] = (int)(Math.random()*30)+1;
                    //*****让整个小循环重新走一遍
                    j = -1;
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }
    }
}



