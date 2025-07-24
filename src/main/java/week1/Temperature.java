package week1;

import java.util.Scanner;

// Question 5
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = ((9 * celsius) / 5) + 32;
        boolean hot = fahrenheit > 100;
        System.out.printf("Temperature: %.1f celsius -> %.1f fahrenheit", celsius, fahrenheit);
        System.out.println("Hot Status: " + hot);
    }
}
