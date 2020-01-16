import baseacounts.BankAccount;

public class CreditableAccount extends BankAccount implements Creditable {
    public CreditableAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public String getTerms() {
        return null;
    }

    @Override
    public void acceptPayment() {

    }

    @Override
    public void calculateInterest() {

    }
}
