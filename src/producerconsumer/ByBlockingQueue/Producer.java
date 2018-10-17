package producerconsumer.ByBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    BlockingQueue<String> queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            String tmp = Thread.currentThread().getName();
            System.out.println(Thread.currentThread().getName() + " have made a product");
            queue.put(tmp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
