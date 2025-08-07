package week4;

// w4q2 - impact of single and multiple parameterized constructors
public class Bank {
    private int accountNumber;
    private String name;
    Bank(){
        System.out.println("Default constructor gets called");
    }

    Bank(int number){
        System.out.println("Single parameterized constructor gets called");
        accountNumber = number;
        System.out.println("Your account number is " + accountNumber);
    }

    Bank(int number, String name){
        System.out.println("Constructor with multiple parameter gets called");
        accountNumber = number;
        this.name = name;
        System.out.println("Your account number is " + accountNumber);
        System.out.println("Your name is "+ this.name);
    }

    public static void main(String[] args) {
        Bank obj1 = new Bank(); // default constructor
        Bank obj2 = new Bank(10); // single parameter
        Bank obj3 = new Bank(10, "Yuvaraj"); // multiple parameters
    }
}
