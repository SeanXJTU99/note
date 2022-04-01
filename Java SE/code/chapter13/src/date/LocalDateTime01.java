package date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTime01 {
    public static void main(String[] args) {
        //第三代日期
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getHour());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String format = dtf.format(ldt);
        System.out.println(format);
        Instant now = Instant.now();
        System.out.println(now);
        Date date = Date.from(now);
        Instant ins = date.toInstant();
    }
}
