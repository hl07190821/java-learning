/**
 * ClassName: MyDate
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/13 23:00
 * @Version 1.0
 */
public class MyDate {
    int year;
    int month;
    int day;

    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        myDate.year = 21;
        myDate.month = 8;
        myDate.day = 2003;
        System.out.println("我的出生年为："+myDate.year);
        System.out.println("我的出生月为："+myDate.month);
        System.out.println("我的出生日为："+myDate.day);
    }
}
