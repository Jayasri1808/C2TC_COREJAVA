package com.tns.ifet.dayfourteen.synchronization;

public class Account implements Bank {
    private int accNo;
    private String name;
    private double balance;

    // Getters and Setters
    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Constructors
    public Account() {
        super();
    }

    public Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    // ToString
    @Override
    public String toString() {
        return "Account [accNo=" + accNo + ", Name=" + name + ", balance=" + balance + "]";
    }

    // Synchronized deposit method
    @Override
    public synchronized void deposit(int amt) throws DepositLimitExceedsException {
        if (amt > DAILY_LIMIT) {
            throw new DepositLimitExceedsException("Daily deposit limit of Rs." + DAILY_LIMIT + " exceeded");
        } else {
            balance += amt;
            System.out.println("Amount Deposited: Rs." + amt);
        }
    }

    // Synchronized withdraw method
    @Override
    public synchronized void withdraw(int amt) throws InsufficientBalanceException {
        if (balance - amt < MINBAL) {
            throw new InsufficientBalanceException("Insufficient balance. Minimum balance of Rs." + MINBAL + " required.");
        } else {
            balance -= amt;
            System.out.println("After withdrawing Rs." + amt + ", current Balance: Rs." + balance);
        }
    }
}
