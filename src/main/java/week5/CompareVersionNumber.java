package week5;

import java.util.Scanner;

public class CompareVersionNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String[] parts1 = str1.split("\\.");
        String[] parts2 = str2.split("\\.");

        for (int i = 0; i < parts1.length; i++) {
            int num1 = Integer.parseInt(parts1[i]);
            int num2 = Integer.parseInt(parts2[i]);

            if (num1 > num2) {
                System.out.println(str1 + " is greater than " + str2);
                return;
            } else if (num1 < num2) {
                System.out.println(str2 + " is greater than " + str1);
                return;
            }
        }
        System.out.println(str1 + " is equal to " + str2);
    }
}

