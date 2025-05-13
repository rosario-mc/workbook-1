package week6.bankMiniExercise;

public class CheckingsAccount extends BankAccount{
    private double transactionFee = 1.50;
    public CheckingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    public void withdraw(double amount) {
        double totalAmount = amount + transactionFee;
        if (totalAmount <= getBalance()){
            super.withdraw(totalAmount);
        }
    }
}
