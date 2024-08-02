class BankAccount {
    private String accountType;
    private double balance;

    // Constructors
    public BankAccount() {
        this.accountType = "Checking";
        this.balance = 0.0;
    }

    public BankAccount(String accountType) {
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public BankAccount(String accountType, double initialBalance) {
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    // Method to deposit cash
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " in cash.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Overloaded method to deposit by check
    public void deposit(double amount, String checkNumber) {
        if (amount > 0 && checkNumber != null && !checkNumber.isEmpty()) {
            balance += amount;
            System.out.println("Deposited $" + amount + " by check number " + checkNumber + ".");
        } else {
            System.out.println("Invalid check deposit.");
        }
    }

    // Method to withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ".");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }

    // Main method to demonstrate functionalities
    public static void main(String[] args) {
        // Create a savings account with initial balance
        BankAccount savingsAccount = new BankAccount("Savings", 500.0);
        System.out.println("Savings account created with balance: $" + savingsAccount.getBalance());

        // Deposit cash
        savingsAccount.deposit(200.0);
        System.out.println("Current balance: $" + savingsAccount.getBalance());

        // Deposit by check
        savingsAccount.deposit(300.0, "CHK12345");
        System.out.println("Current balance: $" + savingsAccount.getBalance());

        // Withdraw
        savingsAccount.withdraw(150.0);
        System.out.println("Current balance: $" + savingsAccount.getBalance());

        // Create a checking account without initial balance
        BankAccount checkingAccount = new BankAccount();
        System.out.println("Checking account created with balance: $" + checkingAccount.getBalance());

        // Deposit cash in checking account
        checkingAccount.deposit(100.0);
        System.out.println("Current balance: $" + checkingAccount.getBalance());
    }
}