package Object.Equals;

/**
 * ClassName: MyDate
 * Package: Object.Equals
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/20 17:52
 * @Version 1.0
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        //报错
        //if (!this.getClass() == object.getClass())
        if (this.getClass() != object.getClass())
            return false;

        MyDate other = (MyDate) object;

        if (day != other.day)
            return false;
        if (month != other.month)
            return false;
        return year == other.year;
    }
}
