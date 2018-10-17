package multithread.threadpool;

import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    static Set<String>[] bucket = new Set[1000];

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);	//??????
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 10, keepAlivetime, TimeUnit.MILLISECONDS,
//	    		new LinkedBlockingQueue<Runnable>());

        System.out.println("initialize cluster");

//        for (int i = 1; i <= 13; i++){
        Runnable task = new PrintNum(16, bucket);
        executor.execute(task);						//????
//        }
//
        executor.shutdown();
//        leiming task = new leiming(rgi, vertexQwordsMap,alphaPostinglists,alphaRadius, reachableTester,
//				vertexSCCMap, k, qpoint, qwords,postinglists, v);
//		executor.execute(task);

        try {
            executor.awaitTermination(1000, TimeUnit.DAYS);			//???????????
        } catch (InterruptedException ex) {
            System.out.println("Interrupted or timed out while awaiting termination");
        }


    }


}