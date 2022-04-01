package date;
import java.util.Calendar;
public class Calender01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH)+1);
    }
}
