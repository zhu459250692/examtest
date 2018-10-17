package producerconsumer.ByWaitNotify;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer capacity = 5;
        List<String> buffer = new LinkedList<String>();
        Producer producer = new Producer(buffer, capacity);
        Consumer consumer = new Consumer(buffer, capacity);
        for (int i = 1; i < 5; i++) {
            new Thread(producer,"Producer" + i).start();
            new Thread(consumer,"Consumer" + i).start();
        }
    }
}
