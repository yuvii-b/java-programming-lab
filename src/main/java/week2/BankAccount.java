// question 1 - BankAccount
package week2;

import java.util.Scanner;

// Question 1
public class BankAccount {
    static int totalAccounts = 0; // static variables
    // instance variables
    private final int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance){
        totalAccounts++; // static variable is incremented in the constructor
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Amount must be a positive value!"); // error handling
        }else{
            double depositAmount = amount; // use of local variable
            this.balance += depositAmount;
        }
    }

    void display(){
        System.out.println("Account details:");
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }

    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B(2024503541) | Week2 | Question1 - BankAccount\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNo = sc.nextInt();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        BankAccount bankAccount = new BankAccount(accountNo, balance); // creation of object
        System.out.print("Enter amount to deposit: ");
        double bal = sc.nextDouble();
        bankAccount.deposit(bal);
        System.out.println("Total accounts created: " + BankAccount.totalAccounts);
        bankAccount.display();
    }
}
