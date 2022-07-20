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
public class SimpleThread {
    public static void go() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> System.out.println("top of the SimpleThread stack"));
        System.out.println("back in main");
        executor.shutdown();
    }
}
