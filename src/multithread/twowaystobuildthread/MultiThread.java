package multithread.twowaystobuildthread;

import java.util.Set;

public class MultiThread implements Runnable{
    static int ticket = 100;
    public MultiThread(){
    }

    @Override
    public void run() {
        while(true){
            block();
        }
    }

    public  void block() {
        synchronized(this){
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(ticket > 0)
                System.out.println(Thread.currentThread().getName() + ":" + ticket--);
//        for (int i = 0; i < 100; i++)
//            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

}
