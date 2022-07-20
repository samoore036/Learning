/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.concurrent.*;
/**
 *
 * @author mooshahe
 */
public class TwoThreads {
    public static void go() {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        threadPool.execute(() -> runJob("Job1"));
        threadPool.execute(() -> runJob("Job2"));
        threadPool.shutdown();
    }
    
    public static void runJob(String jobName) {
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(String.format("%s is running on %s", jobName, threadName));
        }
    }
}
