package week5;

import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not an anagram");
            return;
        }

        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < str1.length(); i++) {
            sum1 += str1.charAt(i);
            sum2 += str2.charAt(i);
        }

        if (sum1 == sum2) {
            System.out.println("The two strings are Anagram");
        } else {
            System.out.println("The two strings are not an anagram");
        }
    }
}
