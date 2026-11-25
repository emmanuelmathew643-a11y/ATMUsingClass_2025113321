/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmusingclass;

/**
 *
 * @author Thinkpad T480
 */
public class BankAccount {

    private double balance;
    private String[] transactions;
    private int transactionCount;

    public BankAccount(double balance) {
        this.balance = balance;
        transactions = new String[100];
        transactionCount = 0;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;

            if (transactionCount < 100) {
                transactions[transactionCount] = "Deposited: " + amount;
                transactionCount++;
            }

            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;

            if (transactionCount < 100) {
                transactions[transactionCount] = "Withdrawn: " + amount;
                transactionCount++;
            }

            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    void showTransactions() {
        System.out.println("\nTransaction History:");

        if (transactionCount == 0) {
            System.out.println("No transactions found.");
        } else {
            for (int i = 0; i < transactionCount; i++) {
                System.out.println(transactions[i]);
            }
        }
    }
}
    

