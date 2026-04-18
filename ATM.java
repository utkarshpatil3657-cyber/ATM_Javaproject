import java.util.Scanner;

class ATM {
    private Account account;
    private Scanner sc;

    public ATM() {
        account = new Account();
        sc = new Scanner(System.in);
    }

    public void start() {
        System.out.print("Enter your PIN: ");
        int pin = sc.nextInt();

        if (account.validatePin(pin)) {
            showMenu();
        } else {
            System.out.println("Incorrect PIN.");
        }
    }

    private void showMenu() {
        int choice;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: ₹" + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}