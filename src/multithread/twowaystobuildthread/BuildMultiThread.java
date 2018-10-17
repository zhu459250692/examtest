package multithread.twowaystobuildthread;

public class BuildMultiThread {
    public static void main(String[] args) {
        MultiThread printNum = new MultiThread();
        MultiThread printNum2 = new MultiThread();
        Thread t1 = new Thread(printNum);
        Thread t2 = new Thread(printNum);
        t1.setName("thread1");
        t1.start();
        t2.setName("thread2");
        t2.start();
    }
}
