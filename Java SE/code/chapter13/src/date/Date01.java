package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date d1 =new Date();
        System.out.println(d1);//Thu Mar 31 06:41:51 CST 2022
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println(format);//20220331 06:43:45 星期四
        String s = "20220331 10:10:10 星期四";
        Date parse = sdf.parse(s);
        System.out.println(sdf.format(parse));
    }
}
