package com.tns.ifet.dayfourteen.synchronization;

public class AccountThread extends Thread {
    private Account acc;
    private int amt;

    public AccountThread(Account acc, int amt) {
        this.acc = acc;
        this.amt = amt;
        start(); // Start thread upon instantiation
    }

    @Override
    public void run() {
        try {
            acc.withdraw(amt);
        } catch (InsufficientBalanceException e) {
            System.err.println(e.getMessage());
        }
    }
}
