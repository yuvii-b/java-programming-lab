package week5;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        String reversed = new String(chars);
        System.out.println("Reversed string: " + reversed);
    }
}

