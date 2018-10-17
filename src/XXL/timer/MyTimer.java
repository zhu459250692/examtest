package XXL.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

public class MyTimer {
    public static void main(String[] args) {
        Timer timer1 = new Timer();
        Timer timer2 = new Timer();
        MyTimerTask myTimerTask1 = new MyTimerTask("task1", 2000);
        MyTimerTask myTimerTask2 = new MyTimerTask("task2", 2000);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("current time is:" + sf.format(calendar.getTime()));

        timer1.schedule(myTimerTask1, calendar.getTime());
        timer2.schedule(myTimerTask2, calendar.getTime());
    }
}
