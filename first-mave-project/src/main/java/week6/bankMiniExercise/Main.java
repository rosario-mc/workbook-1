package week6.bankMiniExercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new CheckingsAccount("Rosario Miller- Canales", 15263));
        accounts.add(new SavingsAccount("Myles Miller", 40156));

        for (BankAccount account : accounts) {
            account.deposit(200);
            account.withdraw(100);

            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).applyInterest();
            }

            System.out.println(account);
        }
    }
}
