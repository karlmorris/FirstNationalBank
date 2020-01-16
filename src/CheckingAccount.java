import baseacounts.DepositBankAccount;

public class CheckingAccount extends DepositBankAccount {

    private final double OVERDRAFT_LIMIT = 50;
    private final double OVERDRAFT_FEE = 30;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
         if (amount < getBalance() + OVERDRAFT_LIMIT) {
             if (amount > getBalance())
                 amount += OVERDRAFT_FEE;

             super.withdraw(amount);

         }
    }
}
