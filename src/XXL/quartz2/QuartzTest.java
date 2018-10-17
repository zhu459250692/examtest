package XXL.quartz2;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;


public class QuartzTest {
    public static void main(String[] args) {
        //����һ��SchedulerFactory����
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = null;

        try {
            //����һ��job
            JobDetail job = JobBuilder.newJob(MyJob.class)
                    .withIdentity("job1", "group1")
                    .build();
            //���崥������Ҳ����ִ��job�Ĺ���
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withSchedule(CronScheduleBuilder.cronSchedule("* * * * * ?"))
                    .build();
            //ͨ��SchedulerFactory�����ȡ���������
            scheduler = schedulerFactory.getScheduler();
            //��job�ʹ�����ע�ᵽ��������
            scheduler.scheduleJob(job, trigger);
            //����������
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }

    }

}
