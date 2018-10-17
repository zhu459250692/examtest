package XXL.quartz2;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;


public class QuartzTest {
    public static void main(String[] args) {
        //创建一个SchedulerFactory对象
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = null;

        try {
            //创建一个job
            JobDetail job = JobBuilder.newJob(MyJob.class)
                    .withIdentity("job1", "group1")
                    .build();
            //定义触发器，也就是执行job的规则
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withSchedule(CronScheduleBuilder.cronSchedule("* * * * * ?"))
                    .build();
            //通过SchedulerFactory对象获取任务调度器
            scheduler = schedulerFactory.getScheduler();
            //把job和触发器注册到调度器中
            scheduler.scheduleJob(job, trigger);
            //启动调度器
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }

    }

}
