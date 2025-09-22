package com.bridgelabz.oops.inbuiltfunction;

public class BankAccount {
    private static String bankName = "State bank of India";
    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.err.println("Insufficient balance or invalid amount.");
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Lynda Princy", "ACC12345", 1000);
        BankAccount acc2 = new BankAccount("Prince Danish", "ACC67890", 500);

        System.out.println("\nAccount 1 Details:");
        acc1.displayAccountDetails();

        System.out.println("\nAccount 2 Details:");
        acc2.displayAccountDetails();

        getTotalAccounts();

        System.out.println("\nTransactions on Account 1:");
        acc1.deposit(200);
        acc1.withdraw(150);
        acc1.displayAccountDetails();

        System.out.println("\nTransactions on Account 2:");
        acc2.deposit(100);
        acc2.withdraw(800);
    }
}