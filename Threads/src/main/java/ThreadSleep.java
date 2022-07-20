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
public class ThreadSleep {
    public static void go() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> sleepThenPrint());
        System.out.println("back in main");
        executor.shutdown();
    }
    
    public static void sleepThenPrint() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("top of the sleep thread stack");
    }
}
