package thinkinjava.socket.multithreadcs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClientThreadPool {
    public static void main(String[] args) {
        int id = 0;
        ExecutorService executor = Executors.newFixedThreadPool(1);    //??????
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 10, keepAlivetime, TimeUnit.MILLISECONDS,
//	    		new LinkedBlockingQueue<Runnable>());

        System.out.println("initialize cluster");

        for (int i = 1; i <= 1; i++) {
            Runnable task = new Client1(id);
            id++;
            executor.execute(task);                        //????
        }
//
        executor.shutdown();
//        leiming task = new leiming(rgi, vertexQwordsMap,alphaPostinglists,alphaRadius, reachableTester,
//				vertexSCCMap, k, qpoint, qwords,postinglists, v);
//		executor.execute(task);

        try {
            executor.awaitTermination(1000, TimeUnit.DAYS);            //???????????
        } catch (InterruptedException ex) {
            System.out.println("Interrupted or timed out while awaiting termination");
        }
    }


}
