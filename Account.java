// Kelas Account
public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        // Contoh penggunaan kelas Account
        Account acc1 = new Account(1000.0);
        System.out.println("Balance: " + acc1.getBalance());
        acc1.deposit(500.0);
        System.out.println("Balance after deposit: " + acc1.getBalance());
        acc1.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + acc1.getBalance());
    }
}