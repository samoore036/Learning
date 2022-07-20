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
public class CountDownLatchExample {
    public static void go() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        CountDownLatch latch = new CountDownLatch(1);
        //parameter of one means the latch will wait for one event to occur
        
        executor.execute(() -> waitForLatchThenPrint(latch));
        
        System.out.println("back in main");
        latch.countDown();
        //tells the latch to count down after go() has printed its message
        
        executor.shutdown();
    }
    
    private static void waitForLatchThenPrint(CountDownLatch latch) {
        try {
            latch.await();
            //wait for go() to print out its message. thread is non-runnable while waiting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("top of the countdown stack");
    }
}
