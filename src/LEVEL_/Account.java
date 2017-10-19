package LEVEL_;

/**
 * Created by bohdan on 08.08.2017.
 */
public class Account {
    private int balance;

    public Account(int initialBalance){
        this.balance = initialBalance;
    }

    public void withdraw(int amount){
        balance = balance - amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        balance = balance + amount;

    }
}
