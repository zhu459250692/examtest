package XXL.quartz2;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

public class MyJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("My QuarTz Job");
        System.out.println("Ö´ÐÐÊ±¼ä:"+new Date());
    }

}
