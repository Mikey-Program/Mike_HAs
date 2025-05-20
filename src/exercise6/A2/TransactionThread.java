package src.exercise6.A2;

public class TransactionThread extends Thread {

    private final BankAccount account;
    private final boolean safeMode;

    public TransactionThread(BankAccount account, boolean safeMode) {
        this.account = account;
        this.safeMode = safeMode;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (safeMode) {
                account.safeDeposit(100);
                account.safeWithdraw(100);
            } else {
                account.deposit(100);
                account.withdraw(100);
            }
        }
    }
}
