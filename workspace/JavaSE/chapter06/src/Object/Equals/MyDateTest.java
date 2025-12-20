package Object.Equals;

/**
 * ClassName: MyDateTest
 * Package: Object.Equals
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/20 17:58
 * @Version 1.0
 */
public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(14,3,1976);
        MyDate date2 = new MyDate(14,3,1976);
        if (date1 == date2){
            System.out.println("date1 == date2");
        }else {
            System.out.println("date1 != date2");
        }

        if (date1.equals(date2)){
            System.out.println("date1 == date2");
        }else {
            System.out.println("date1 != date2");
        }
    }
}
