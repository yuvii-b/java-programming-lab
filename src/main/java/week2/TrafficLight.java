// Question 7 - Traffic Light Response
package week2;

import java.util.Scanner;

// Question 7
public class TrafficLight {
    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B(2024503541) | Week2 | Question7 - Traffic Light Response\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the traffic light colour (red, yellow, green): ");
        String colour = scanner.nextLine().toLowerCase(); // converted to lowercase

        switch (colour) {
            case "red" -> System.out.println("Stop");
            case "yellow" -> System.out.println("Ready to move");
            case "green" -> System.out.println("Go");
            default -> System.out.println("Invalid colour");
        }
    }
}
