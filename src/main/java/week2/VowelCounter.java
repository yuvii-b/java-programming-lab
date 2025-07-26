// Question 5 - Vowel frequency counter
package week2;

import java.util.Scanner;

// Question 5
public class VowelCounter {
    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B(2024503541) | Week2 | Question5 - Vowel Counter\n");

        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = scanner.nextLine().toLowerCase(); // converted input string to lowercase

        char[] characters = sentence.toCharArray();
        int[] vowels = new int[5]; // array to keep track of vowel frequencies

        for(char letter : characters){
            switch(letter){
                case 'a' -> ++vowels[0];
                case 'e' -> ++vowels[1];
                case 'i' -> ++vowels[2];
                case 'o' -> ++vowels[3];
                case 'u' -> ++vowels[4];
            }
        }

        System.out.println("The lowercase of the input is: " + sentence);
        System.out.println("Vowel frequencies: ");
        System.out.println("a:" + vowels[0]);
        System.out.println("e:" + vowels[1]);
        System.out.println("i:" + vowels[2]);
        System.out.println("o:" + vowels[3]);
        System.out.println("u:" + vowels[4]);
    }
}
