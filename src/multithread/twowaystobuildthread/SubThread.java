package multithread.twowaystobuildthread;

import java.lang.Thread.*;

public class SubThread extends Thread {
    static int ticket = 10;
    static Object object = new Object();
    public SubThread() {
    }

    public static void main(String[] args) {
        /*
        线程A线程B交替打印
         */
        SubThread test = new SubThread();
        test.setName("threadA");
        test.start();
        SubThread test2 = new SubThread();
        test2.setName("threadB");
        test2.start();
    }


    @Override
    public void run() {
        while(true){
            block();
        }
    }

    public  void block() {
        synchronized (object){
            //只有线程获得对象锁才能调用wait、notify、notifyAll方法
            //唤醒正在等待当前对象锁的线程
            object.notify();
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(ticket > 0)
                System.out.println(Thread.currentThread().getName() + ":" + ticket--);
            try {
                //该线程自我阻塞
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
