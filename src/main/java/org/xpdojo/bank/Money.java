package org.xpdojo.bank;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {
    private final double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double amount() {
        return this.amount;
    }
}
