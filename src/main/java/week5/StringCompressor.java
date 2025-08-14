package week5;

import java.util.Scanner;

public class StringCompressor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input == null || input.isEmpty()) {
            System.out.println(input);
            return;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i)).append(count);
                count = 1;
            }
        }

        System.out.println((compressed.length() < input.length()) ? compressed : input);

    }
}

