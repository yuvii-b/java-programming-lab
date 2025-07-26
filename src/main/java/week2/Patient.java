//Question 4 - Patient appointment
package week2;

import java.util.Scanner;

// Question 4
public class Patient {
    // instance variables
    private final int age;
    private final int appointmentNumber;
    private boolean priority;

    public Patient(int age, int appointmentNumber){
        this.age = age;
        this.appointmentNumber = appointmentNumber;
    }

    public boolean isEligible(){
        return this.age >= 18 && this.age <= 65;
    }

    public boolean verifyAppointment(){
        // checks for 3-digit number and assigns priority
        if((int)Math.log10(appointmentNumber) + 1 == 3){
            priority = appointmentNumber % 2 == 0;
            return true;
        }else{
            return false;
        }
    }

    public void assignSlot(){
        // slot based on priority
        if(priority) System.out.println("Slot: Priority");
        else System.out.println("Slot: Regular");
    }

    public void provideGift(){
        // provides gift to patients based on appointment number
         switch (appointmentNumber % 10) {
            case 1 -> System.out.println("Gift: Pen");
            case 2 -> System.out.println("Gift: Mask");
            case 3 -> System.out.println("Gift: Sanitizer");
            default -> System.out.println("No special gift");
        }
    }

    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B(2024503541) | Week2 | Question4 - Patient appointment\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient's age: ");
        int age = scanner.nextInt();
        System.out.print("Enter appointment number: ");
        int appointmentNumber = scanner.nextInt();

        Patient patient = new Patient(age, appointmentNumber);
        if(!patient.isEligible()){
            System.out.println("Patient not eligible for vaccination!");
        }
        else{
            if(patient.verifyAppointment()){
                patient.assignSlot();
                patient.provideGift();
            } else {
                System.out.println("Invalid appointment number, must be a 3-digit number"); // invalid input handling
            }
        }
    }
}
