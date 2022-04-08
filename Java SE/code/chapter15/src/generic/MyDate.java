package generic;

public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    @Override
    public String toString() {
        return  year +
                "." + month +
                "." + day;
    }

    @Override
    public int compareTo(MyDate o) {
        int years = year-o.getYear();
        if(years!=0){
            return years;
        }
        int months = month - o.getMonth();
        if(months!= 0){
            return months;
        }
        return day - o.getDay();
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


}
