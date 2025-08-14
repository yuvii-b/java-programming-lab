package week5;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B (2024503541) | Week 5 | Question - Email Validation\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        boolean isValid = true;

        if (email.indexOf('@') == -1 || email.indexOf('@') != email.lastIndexOf('@')) {
            isValid = false;
        } else {
            String[] parts = email.split("@");
            if (parts.length != 2) {
                isValid = false;
            } else {
                String username = parts[0];
                String domain = parts[1];

                if (username.isEmpty() || username.length() > 25) {
                    isValid = false;
                } else if (!username.matches("[a-zA-Z0-9_\\-+]+")) {
                    isValid = false;
                }

                if (!(domain.endsWith(".com") || domain.endsWith(".in") || domain.endsWith(".edu"))) {
                    isValid = false;
                }
                if (isValid) {
                    System.out.println("Valid Email");
                    System.out.println("Username: " + username);
                    System.out.println("Domain: " + domain);
                }
            }
        }

        if (!isValid) {
            System.out.println("Invalid Email");
        }
    }
}

