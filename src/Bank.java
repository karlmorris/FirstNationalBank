import baseacounts.BankAccount;
import baseacounts.DepositBankAccount;

public class Bank {
    public static void main(String[] args) {
        DepositBankAccount account = new SavingsAccount("12345", 100.0);

        account.deposit(56);
        //account.withdraw(125);
        System.out.println(account.getBalance());

    }


    public static void batchInterest(Creditable... accounts){
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].calculateInterest();
        }
    }
}



