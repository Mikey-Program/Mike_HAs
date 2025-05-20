package src.exercise6.A2;

public class BankAccount {

    private int balance;

    public BankAccount (int initialBalance ) {
        this.balance = initialBalance ;
    }

    public void deposit(int amount){
        this.balance = this.balance + amount;
    }

    public void withdraw(int amount){
        this.balance = this.balance - amount;
    }

    // Synchronized methods (to fix race condition)
    public synchronized void safeDeposit(int amount) {
        balance += amount;
    }

    public synchronized void safeWithdraw(int amount) {
        balance -= amount;
    }

    public int getBalance () {
        return balance;
    }
}
