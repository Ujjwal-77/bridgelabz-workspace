import java.util.Scanner;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        ZonedDateTime formatterGmt=ZonedDateTime.now(ZoneId.of("GMT"));

        ZonedDateTime formatterIst=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        ZonedDateTime formatterPst=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        
        System.out.println(formatterGmt.format(formatter));
        System.out.println(formatterIst.format(formatter));
        System.out.println(formatterPst.format(formatter));
    }
}
