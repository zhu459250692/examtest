package multithread.twowaystobuildthread;

import java.lang.Thread.*;

public class SubThread extends Thread {
    static int ticket = 10;
    static Object object = new Object();
    public SubThread() {
    }

    public static void main(String[] args) {
        /*
        �߳�A�߳�B�����ӡ
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
            //ֻ���̻߳�ö��������ܵ���wait��notify��notifyAll����
            //�������ڵȴ���ǰ���������߳�
            object.notify();
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(ticket > 0)
                System.out.println(Thread.currentThread().getName() + ":" + ticket--);
            try {
                //���߳���������
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
