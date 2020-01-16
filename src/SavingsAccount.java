import baseacounts.DepositBankAccount;

public class SavingsAccount extends DepositBankAccount {


    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount)
            super.withdraw(amount);
    }
}
