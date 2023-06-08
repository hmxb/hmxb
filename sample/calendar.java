package sample;
import java.util.Calendar;

public class calendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
       
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);

        System.out.println(year + "/" + month + "/" + day + " " + hour + ":" + minute );

        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, 6);
        cal.set(Calendar.DATE, 2);

        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DATE);
        
        System.out.println(year + "/" + month + "/" + day);

    }
}
