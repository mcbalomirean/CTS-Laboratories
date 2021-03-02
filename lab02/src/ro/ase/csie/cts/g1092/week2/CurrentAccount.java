package ro.ase.csie.cts.g1092.week2;

import ro.ase.csie.cts.g1092.week2.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1092.week2.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount {
    private final static double MAX_CREDIT = 5000d;

    public CurrentAccount(String iban) {
        super(iban, MAX_CREDIT);
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > this.balance) {
            throw new InsufficientFundsException("Insufficient funds!");
        } else {
            this.balance -= amount;
        }
    }

    @Override
    public void transfer(Account destination, double amount) throws InsufficientFundsException, IllegalTransferException {
        if (this == destination) {
            throw new IllegalTransferException("Can't transfer to the same account!");
        }

        this.withdraw(amount);
        destination.deposit(amount);
    }
}
