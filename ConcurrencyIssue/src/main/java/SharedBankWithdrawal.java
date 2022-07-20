/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
public class SharedBankWithdrawal implements Runnable{
    private final String name;
    //private final BankAccount account;
    private final AtomicBankAccount atomicAccount;
    private final int amountToSpend;
    
    public SharedBankWithdrawal(String name, AtomicBankAccount atomicAccount, int amountToSpend) {
        this.name = name;
        this.atomicAccount = atomicAccount;
        this.amountToSpend = amountToSpend;
    }
    
    @Override
    public void run() {
        goShopping(this.amountToSpend);
    }
    
    private void goShopping(int amount) {
        synchronized (this.atomicAccount) {//lock the account object so only one thread can access at a time
            if (this.atomicAccount.getBalance() >= amount) {
                this.atomicAccount.spend(this.name, amount);
                System.out.println(String.format("%s spends %s. \nAccount balance is %s.", this.name, amount, this.atomicAccount.getBalance()));
            } else {
                System.out.println(String.format("Sorry, there is insufficient funds in the account. Please add more funds, %s.", this.name));
            }
        }
    }
}
