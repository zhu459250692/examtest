package multithread.threadpool;

import java.util.Set;

public class PrintNum implements Runnable{
    int index;
    Set<String>[] bucket = new Set[1000];
    Set<String>[] Mem = new Set[17];

    public PrintNum(int thread_index, Set[] common_bucket){
    }

    @Override
    public void run() {
        block();
    }

    public synchronized void block() {
        for (int i = 0; i < 100; i++)
            System.out.println(Thread.currentThread().getName() + ":" + i);
    }

}
