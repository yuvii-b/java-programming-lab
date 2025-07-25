// Question 3 - User admin authentication
package week2;

import java.util.Scanner;

// Question 3
public class UserAuthentication {

    static int loginFailures;
    private String role = "admin";
    private String password = "password123";

    private void incrementFailure(){
        loginFailures++;
    }

    public void display() {
        System.out.println("Failure count: " + loginFailures);
    }

    public boolean authenticate(String role, String password){
        if(!this.role.equals(role) && !this.password.equals(password)){ // null pointer exception handled
            incrementFailure();
            System.out.println("Enter the correct values");
            return false;
        }
        System.out.println("Logged in!");
        return true;
    }


    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B(2024503541) Question3 - Authentication\n");

        Scanner sc = new Scanner(System.in);
        UserAuthentication user1 = new UserAuthentication();
        String password, role;
        do{
            System.out.print("Enter the role: ");
            role = sc.nextLine();
            System.out.print("Enter the password: ");
            password = sc.nextLine();
        }while(!user1.authenticate(role, password));
        user1.display();
    }
}
