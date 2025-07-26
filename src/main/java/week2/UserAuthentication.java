// Question 3 - User admin authentication
package week2;

import java.util.Scanner;

// Question 3
public class UserAuthentication {

    static int loginFailures = 0;
    private final String correctRole = "admin";
    private final String correctPassword = "password123";

    private void incrementFailure(){
        loginFailures++;
        System.out.println("Login failed, Failure count: " + loginFailures);
    }

    public void display() {
        System.out.println("Failure count: " + loginFailures);
    }

    public boolean authenticate(String role, String password){
        // logs in if both are true
        if(correctRole.equals(role) && correctPassword.equals(password)){
            System.out.println("Logged in successfully!");
            return true;
        }
        // increments failure count if non-admin log in fails
        if(!correctRole.equals(role) && !correctPassword.equals(password)){
            incrementFailure();
        } else{
            System.out.println("Incorrect credentials."); // if admin login fails nothing happens
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B(2024503541) | Week2 | Question3 - Authentication\n");

        Scanner scanner = new Scanner(System.in);
        UserAuthentication user1 = new UserAuthentication();
        String password, role;
        do{
            System.out.print("Enter the role: ");
            role = scanner.nextLine();
            System.out.print("Enter the password: ");
            password = scanner.nextLine();
        }while(!user1.authenticate(role, password));
        user1.display();
    }
}
