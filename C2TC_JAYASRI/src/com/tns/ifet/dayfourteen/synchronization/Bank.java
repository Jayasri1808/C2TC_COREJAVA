package com.tns.ifet.dayfourteen.synchronization;

// Changed to interface
public interface Bank {
    int MINBAL = 5000; // Fields are implicitly static and final
    int DAILY_LIMIT = 25000;

    void deposit(int amt) throws DepositLimitExceedsException;
    void withdraw(int amt) throws InsufficientBalanceException;
}
