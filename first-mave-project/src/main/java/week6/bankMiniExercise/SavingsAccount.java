package week6.bankMiniExercise;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    public void withdraw(double amount){
        if(amount <=getBalance()){
            super.withdraw(amount);
        }
    }

    public void applyInterest() {
        double interest = getBalance() * 0.02;
        deposit(interest);
    }
}
