package producerconsumer.ByBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingQueue<String>(2);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        for (int i = 0; i < 5; i++) {
            new Thread(producer, "Producer" + (i + 1)).start();

            new Thread(consumer, "Consumer" + (i + 1)).start();
        }

    }
}
