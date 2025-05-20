package src.exercise6.A2;

public class BankAccountSimulator {

    public static void main(String [] args) throws InterruptedException {

        BankAccount account = new BankAccount (1000);

        System.out.println("=== Unsynchronized version ===");
        BankAccount unsafeAccount = new BankAccount(1000);
        TransactionThread t1 = new TransactionThread(unsafeAccount, false);
        TransactionThread t2 = new TransactionThread(unsafeAccount, false);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final balance (unsafe): " + unsafeAccount.getBalance());

        System.out.println("\n=== Synchronized version ===");
        BankAccount safeAccount = new BankAccount(1000);
        Thread t3 = new TransactionThread(safeAccount, true);
        TransactionThread t4 = new TransactionThread(safeAccount, true);
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        System.out.println("Final balance (safe): " + safeAccount.getBalance());
    }
}
