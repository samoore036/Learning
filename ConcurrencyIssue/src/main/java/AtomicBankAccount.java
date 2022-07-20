/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.concurrent.atomic.AtomicInteger;
/**
 *
 * @author mooshahe
 */
public class AtomicBankAccount {
    private final AtomicInteger balance = new AtomicInteger(100);
    //atomic integer is used to apply CAS which will check if the value we expect matches current value so thread can execute
    
    public int getBalance() {
        return balance.get();
        //use the get() method of the AtomicInteger class to get the int value
    }
    
    public void spend(String name, int amount) {
        int initialBalance = balance.get();
        //necessary to use as the expected value in the CAS operation
        if (initialBalance >= amount) {
            boolean success = balance.compareAndSet(initialBalance, initialBalance - amount);
            //the balance will not be changed if the initial balance doesn't match the actual balance right now 
            if (!success) {
                System.out.println(String.format("Insufficient funds, %s.", name));
            } else {
                System.out.println(String.format("Successful transaction, %s. New balance is %s.", name, this.getBalance()));
            }
        }
    }
}
