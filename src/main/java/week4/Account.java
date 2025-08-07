package week4;

// w4q7 - static blocks
public class Account {
    static int interestRate;
    static int minimumBalance;
    int accountNo;
    int balance;
    String name;

    // runs when the class is loaded
    static{
        System.out.println("Static block is executed");
        interestRate = 5;
        minimumBalance = 100;
    }

    Account(String name, int accountNo, int balance){
        System.out.println("Constructor is executed");
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void display(){
        System.out.println("Account number: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    static void modifyMinimumBalance(){
        minimumBalance = 500;
        // balance = balance + 50; cannot access instance variables inside static methods
        // display(); also cannot call instance methods

    }
    public static void main(String[] args) {
        Account account = new Account("Mark", 2825, 500);
        account.display();
    }
}
