import baseacounts.BankAccount;

public class LoanAccount extends CreditableAccount {

    public LoanAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}
