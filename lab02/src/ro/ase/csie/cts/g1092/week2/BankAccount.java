package ro.ase.csie.cts.g1092.week2;

public abstract class BankAccount extends Account {
    protected final String iban;
    protected double balance;

    public BankAccount(String iban, double balance) {
        this.iban = iban;
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}
