package com.tns.ifet.dayfourteen.synchronization;

public class DepositLimitExceedsException extends Exception {
    public DepositLimitExceedsException() {
        super("Daily limit of deposit exceeded.");
    }

    public DepositLimitExceedsException(String message) {
        super(message);
    }
}
