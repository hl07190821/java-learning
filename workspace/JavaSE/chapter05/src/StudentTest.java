/**
 * ClassName: StudentTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/14 16:34
 * @Version 1.0
 */
public class StudentTest {

    public static void main(String[] args) {
        //对象引用数组
        Student[] students =  new Student[20];
        int[] arr = new int[5];
        //基本数据类型数组中存储的直接就是基本数值
        arr[1] = 1;
        //通过循环结构给数组的属性赋new值
        for (int i = 0;i <students.length;i++){
            //引用对象数组存储的是引用对象的首地址
            students[i] = new Student();
            //数组元素是一个对象，给对象的各个属性赋值
            students[i].number = (i+1);
            students[i].state = (int)(Math.random()*6+1);
            students[i].score = (int)(Math.random()*101);
        }

        //问题一：打印出三年级的学生信息
        for(int i = 0;i<students.length;i++){
            if(students[i].state  == 3){
                System.out.print("number:"+students[i].number+",score:"+students[i].score);

            }
            System.out.println();
        }

        System.out.println("******************************");
        //冒泡排序之前
        for (int i = 0;i < students.length;i++){
            System.out.println("number:"+students[i].number+",score:"+students[i].score+",state:"+students[i].state);

        }

        //使用冒泡牌型按学生成绩排序，并遍历所有学生信息
        for (int i = 1;i < students.length;i++){
            for(int j = 0;j < students.length-i;j++){
                if(students[j].score > students[j+1].score ){
                    //注意，直接交换首地址
                    //报错，不能对对象引用进行+操作，没有意义
                    //students[j] = students[j]+students[j+1];
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
        System.out.println("************************");
        //冒泡排序之后
        for (int i = 0;i < students.length;i++){
            System.out.println("number:"+students[i].number+",score:"+students[i].score+",state:"+students[i].state);

        }
    }
}
