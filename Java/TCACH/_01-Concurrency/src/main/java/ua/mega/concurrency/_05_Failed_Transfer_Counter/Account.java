package ua.mega.concurrency._05_Failed_Transfer_Counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private int balance;
    private final Lock lock = new ReentrantLock();
    private int failCounter;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public Lock getLock() {
        return lock;
    }

    public void incFailedTransferCount() {
        failCounter++;
    }

    public int getFailCounter() {
        return failCounter;
    }
}
