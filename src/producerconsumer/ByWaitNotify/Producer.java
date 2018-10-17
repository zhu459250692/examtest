package producerconsumer.ByWaitNotify;

import java.util.LinkedList;
import java.util.List;

public class Producer implements Runnable {
    private List<String> buffer = new LinkedList<String>();
    private Integer capacity;

    public Producer(List buffer, Integer capacity) {
        this.buffer = buffer;
        this.capacity = capacity;
    }

    @Override
    public void run() {
        synchronized (capacity){
            try {
                if (buffer.size() >= capacity)
                    capacity.wait();
                buffer.add(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName() + " have made a product");
                capacity.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
