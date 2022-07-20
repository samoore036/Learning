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
public class main {
    public static void main(String[] args) {
        //BankAccount account = new BankAccount();
        AtomicBankAccount atomicAccount = new AtomicBankAccount();
        SharedBankWithdrawal person1 = new SharedBankWithdrawal("Person one", atomicAccount, 50);
        SharedBankWithdrawal person2 = new SharedBankWithdrawal("Person two", atomicAccount, 100);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(person1);
        executor.execute(person2);
        executor.shutdown();
    }
}
