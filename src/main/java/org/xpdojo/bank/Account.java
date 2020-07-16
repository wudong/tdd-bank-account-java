package org.xpdojo.bank;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private double balance;
    private List<Transaction> transactions = new ArrayList<Transaction>();

    public void deposit(double amount){
        this.balance +=amount;
        transactions.add(new Transaction(amount));
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
            transactions.add(new Transaction(-amount));
        }
    }

    public void transfer(Account account, double amount) {
        if (this.balance >= amount) {
            withdraw(amount);
            account.deposit(amount);
        }
    }

    public double balance() {
        return this.balance;
    }

    public String balanceSlip(){
        return "";
    }

    public String statementSlip() {
        return "";
    }


}
