class Account {
    private int pin = 1234;
    private double balance = 1000;

    // Method to validate PIN
    public boolean validatePin(int inputPin) {
        return this.pin == inputPin;
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Please collect your cash.");
        }
    }
}