import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Clock {
    public static void main(String[] args) throws Exception {
        int i;
        Calendar cal = Calendar.getInstance();
        Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));

        i = t.getMinute();

        System.out.println(System.currentTimeMillis());
        while (i == t.getMinute()) {
            t.tick();
            System.out.println(t.toString());
            TimeUnit.SECONDS.sleep(1);
        }

    }
}