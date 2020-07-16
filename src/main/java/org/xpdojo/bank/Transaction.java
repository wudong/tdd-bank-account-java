package org.xpdojo.bank;

import java.util.Date;

public class Transaction {
    private final Date timestamp;
    private final double amount;

    public Transaction(double amount) {
        this.timestamp = new Date();
        this.amount = amount;
    }


}
