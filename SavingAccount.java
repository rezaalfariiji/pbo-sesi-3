// Subkelas SavingAccount
public class SavingAccount extends Account {
    @SuppressWarnings("unused")
    private double interestRate;

    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
}