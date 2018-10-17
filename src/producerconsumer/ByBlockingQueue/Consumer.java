package producerconsumer.ByBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    /*
        BlockingQueue put(e) �� take() �����������Ǵ������ġ�
     */
    BlockingQueue<String> queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            String tmp = queue.take();
            System.out.println(Thread.currentThread().getName() + " have consumed a product from " + tmp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
