package baseacounts;

import baseacounts.BankAccount;

abstract public class DepositBankAccount extends BankAccount {


    public DepositBankAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void deposit(double amount) {
        super.setBalance(amount);
    }
}
