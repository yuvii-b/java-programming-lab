package week5;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        if (str.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            System.out.println("Number of words: " + str.split(" ").length);
        }
    }
}

