package XXL.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask{
    private String name;
    private long costTime;
    public MyTimerTask(String inputName, long inputCostTime){
        name = inputName;
        costTime = inputCostTime;
    }

    @Override
    public void run() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(name+"'s current start time is:" + sf.format(calendar.getTime()));
        try{
            Thread.sleep(costTime);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        calendar = Calendar.getInstance();
        System.out.println(name+"'s current end time is:" + sf.format(calendar.getTime()));
    }
}
