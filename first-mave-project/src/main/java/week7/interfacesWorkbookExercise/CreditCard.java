package week7.interfacesWorkbookExercise;

public class CreditCard implements Valuable{
    private String name;
    private String accountNr;
    private double balance;

    public CreditCard(String name, String accountNr, double balance) {
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

    public void charge(double amount) {
        balance += amount;
    }

    public void pay(double amount) {
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