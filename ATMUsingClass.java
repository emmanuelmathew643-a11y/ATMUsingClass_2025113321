/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmusingclass;

import java.util.Scanner;
/**
 *
 * @author Thinkpad T480
 */
public class ATMUsingClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        

        Scanner input = new Scanner(System.in);

        Customer customer = new Customer("Emmanuel", 1234);
        BankAccount account = new BankAccount(5000);

        int enteredPin;
        int attempts = 0;
        boolean loggedIn = false;

        System.out.println("===== WELCOME TO ATM =====");

        while (attempts < 3) {

            System.out.print("Enter your PIN: ");
            enteredPin = input.nextInt();

            if (customer.checkPin(enteredPin)) {
                loggedIn = true;
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN!");

                System.out.println("Attempts remaining: " + (3 - attempts));
            }
        }

        if (loggedIn) {

            System.out.println("\nWelcome " + customer.getName());

            int choice;

            do {

                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. View Transactions");
                System.out.println("5. Exit");

                System.out.print("Choose an option: ");
                choice = input.nextInt();

                if (choice == 1) {

                    System.out.println("Your balance is: " + account.getBalance());

                } else if (choice == 2) {

                    System.out.print("Enter deposit amount: ");
                    double amount = input.nextDouble();

                    account.deposit(amount);

                } else if (choice == 3) {

                    System.out.print("Enter withdrawal amount: ");
                    double amount = input.nextDouble();

                    account.withdraw(amount);

                } else if (choice == 4) {

                    account.showTransactions();

                } else if (choice == 5) {

                    System.out.println("Thank you for using our ATM!");

                } else {

                    System.out.println("Invalid option!");

                }

            } while (choice != 5);

        } else {

            System.out.println("Your account is locked. Too many incorrect attempts.");

        }

        input.close();
    }
}

