package week5;

import java.util.Scanner;

public class LetterOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase();

        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }

        System.out.println("Letter occurrences:");
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + " : " + count[i]);
            }
        }
    }
}

