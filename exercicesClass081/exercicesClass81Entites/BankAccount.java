package exercicesClass81.exercicesClass81Entites;

public class BankAccount {
    private final int userAccount;
    private String name;
    private double balance = 0;

    public BankAccount (int account, String fullName, double balance){
        this.userAccount = account;
        this.name = fullName;
        this.balance = balance;
    }

    public BankAccount (int account, String fullName) {
        this.userAccount = account;
        this.name = fullName;
    }

    public double deposit (double value) {
        return balance += value;
    }

    public double withdraw (double value) {
        return balance -= value + 5;
    }

    public int getUserAccount() {
        return userAccount;
    }

    public String getName() {
        return name;
    }

    public void setName (String newName) {
        this.name = newName;
    }

    @Override
    public String toString() {
        return String.format("Account %d"
        +", Holder: %s"
        +", Balance: $ %.2f", this.userAccount, this.name, this.balance);
    }
}
