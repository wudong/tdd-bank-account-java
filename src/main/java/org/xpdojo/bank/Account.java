package org.xpdojo.bank;

public class Account {

    private double balance;

    public void deposit(double amount){
        this.balance +=amount;
    }

    public void withdraw(double amount) {
        this.balance -=amount;
    }

    public void transfer(Account account, double balance) {
        withdraw(balance);
        account.deposit(balance);
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
