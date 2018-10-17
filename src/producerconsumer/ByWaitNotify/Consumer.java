package producerconsumer.ByWaitNotify;

import java.util.LinkedList;
import java.util.List;

public class Consumer implements Runnable {
    private List<String> buffer = new LinkedList<String>();
    private Integer capacity;

    public Consumer(List buffer, Integer capacity) {
        this.buffer = buffer;
        this.capacity = capacity;
    }

    @Override
    public void run() {
        synchronized (capacity){
            try {
                if (buffer.isEmpty())
                    capacity.wait();
                String tmp = buffer.remove(0);
                System.out.println(Thread.currentThread().getName() + " have consume a product from " + tmp);
                capacity.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
