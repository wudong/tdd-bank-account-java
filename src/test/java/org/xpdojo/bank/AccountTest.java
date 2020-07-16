package org.xpdojo.bank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountWillHaveZeroBalance() {
        Account account = new Account();
        Assertions.assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(10);
        Assertions.assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void withdrawAnAmountToDecreaseTheBalance() {
        Account account = new Account();
        account.deposit(10);
        account.withdraw(5);
        Assertions.assertThat(account.balance()).isEqualTo(5);
    }

    @Test
    public void youCannotWithdrawMoreThanYouHave() {
        Account account = new Account();
        account.deposit(5);
        account.withdraw(10);
        Assertions.assertThat(account.balance()).isEqualTo(5);
    }

    @Test
    public void testTransferBetweenTest() {
        Account account = new Account();
        account.deposit(10);

        Account account2 = new Account();
        account2.deposit(10);

        account.transfer(account2, 10);

        Assertions.assertThat(account.balance()).isEqualTo(0);
        Assertions.assertThat(account2.balance()).isEqualTo(20);
    }


    @Test
    public void testTransferBetweenTestForMoreThanYouHave() {
        Account account = new Account();
        account.deposit(10);

        Account account2 = new Account();
        account2.deposit(10);

        account.transfer(account2, 11);

        Assertions.assertThat(account.balance()).isEqualTo(10);
        Assertions.assertThat(account2.balance()).isEqualTo(10);
    }



}
