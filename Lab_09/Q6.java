package Lab_09;
class BankAccountQ6 {
    int balance = 1000;
    synchronized void deposit(int amount) {
        balance += amount;

        System.out.println(Thread.currentThread().getName()
                + " Deposited: " + amount);

        System.out.println("Balance: " + balance);
    }
    synchronized void withdraw(int amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println(Thread.currentThread().getName()
                    + " Withdrawn: " + amount);

            System.out.println("Balance: " + balance);

        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
class DepositThread extends Thread {
    BankAccountQ6 b;
    DepositThread(BankAccountQ6 b) {
        this.b = b;
    }

    public void run() {
        b.deposit(500);
    }
}
class WithdrawThread extends Thread {

    BankAccountQ6 b;

    WithdrawThread(BankAccountQ6 b) {
        this.b = b;
    }

    public void run() {
        b.withdraw(700);
    }
}
public class Q6 {

    public static void main(String[] args) {

        BankAccountQ6 b = new BankAccountQ6();

        DepositThread t1 = new DepositThread(b);
        WithdrawThread t2 = new WithdrawThread(b);

        t1.start();
        t2.start();
    }
}