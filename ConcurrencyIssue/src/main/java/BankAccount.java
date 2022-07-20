/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
public class BankAccount {
    private int balance = 100;
    private int overdraft = 0;
    
    public int getBalance() {
        return this.balance;
    }
    
    public void spend(int amount) {//add synchronized keyword to ensure only one thread can access the bank account object at a time
        this.balance = this.balance - amount;
        if (this.balance < 0) {
            overdraft += 15;
            System.out.println(String.format("Insufficient funds! \nOverdraft fee would now be %s", this.overdraft));
        }
    }
}
