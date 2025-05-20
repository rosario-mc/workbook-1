package week7.interfacesWorkbookExercise;

public class BankAccount implements Valuable{
    private String name;
    private String accountNr;
    private double balance;

    public BankAccount(String name, String accountNr, double balance) {
        this.name = name;
        this.accountNr = accountNr;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNr() {
        return accountNr;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return balance;
    }

    @Override
    public String toString() {
        return getName() + " worth $" + String.format("%.2f", getValue());
    }

    @Override
    public int compareTo(Valuable other) {
        return Double.compare(this.getValue(), other.getValue());
    }
}
