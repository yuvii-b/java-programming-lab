// question 2 - Attendance
package week2;

import java.util.Scanner;

// Question 2
public class Attendance {

    private final byte[][] attendance = new byte[5][8]; // 2D array for attendance through the whole week
    private final Scanner scanner = new Scanner(System.in); // scanner obj for input handling

    public void takeInput(){
        System.out.println("Enter 1 for present or 0 for absent for each hour of the day");
        for(int day = 0; day < attendance.length; ++day){
            System.out.println("Day " + (day + 1));
            for(int hour = 0; hour < attendance[0].length; ++hour){
                System.out.print("Hour " + (hour + 1) + ": ");
                attendance[day][hour] = scanner.nextByte();
                if(attendance[day][hour] != 1 && attendance[day][hour] != 0){
                    System.out.println("Only enter values 0 or 1 !"); // error handling for inputs other than 0 or 1
                    hour--;
                }
            }
            System.out.println();
        }
    }

    public void calculatePercentage(){
        byte totalPresentHours = 0;
        System.out.println("Attendance summary: ");
        for(int day = 0; day < attendance.length; ++day){
            byte dailyPresentHours = 0;
            for(int hour = 0; hour < attendance[day].length; ++hour){
                dailyPresentHours += attendance[day][hour];
            }
            double dailyPercentage = ((double) dailyPresentHours / 8) * 100;
            System.out.printf("Day %d: %.2f%% present\n", day + 1, dailyPercentage);
            totalPresentHours += dailyPresentHours;
        }
        System.out.println("Weekly percentage: " + ( (double) totalPresentHours / (5*8)) * 100);
    }

    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B(2024503541) | Week2 | Question2 - Attendance\n");

        Attendance attendance = new Attendance();
        attendance.takeInput();
        attendance.calculatePercentage();
    }
}
