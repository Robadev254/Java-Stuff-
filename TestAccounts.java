import java.util.Date;

class Account {
    private int accountNumber;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(int accountNumber, double balance, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated +
                '}';
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, double balance, double annualInterestRate) {
        super(accountNumber, balance, annualInterestRate);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber=" + super.toString() +
                '}';
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, double balance, double annualInterestRate, double overdraftLimit) {
        super(accountNumber, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber=" + super.toString() +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
}

public class TestAccounts {
    public static void main(String[] args) {
        Account account = new Account(1001, 5000, 0.05);
        SavingsAccount savingsAccount = new SavingsAccount(2001, 3000, 0.03);
        CheckingAccount checkingAccount = new CheckingAccount(3001, 2000, 0.02, 1000);

        System.out.println(account);
        System.out.println(savingsAccount);
        System.out.println(checkingAccount);
    }
}
