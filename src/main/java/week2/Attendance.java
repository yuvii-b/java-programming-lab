// question 2 - Attendance
package week2;

import java.util.Scanner;

// Question 2
public class Attendance {

    private byte[][] attendance = new byte[5][8]; // 2D array for attendance through the whole week
    private Scanner sc = new Scanner(System.in); // scanner obj for input handling

    public void takeInput(){
        System.out.println("Enter 1 for present or 0 for absent for each hour of the day");
        for(int i = 0; i < attendance.length; ++i){
            System.out.println("Day " + (i + 1));
            for(int j = 0; j < attendance[0].length; ++j){
                System.out.print("Hour " + (j + 1) + ": ");
                attendance[i][j] = sc.nextByte();
                if(attendance[i][j] != 1 && attendance[i][j] != 0){
                    System.out.println("Only enter values 0 or 1 !"); // error handling for inputs other than 0 or 1
                    j--;
                }
            }
            System.out.println();
        }
    }

    public void calculatePercentage(){
        byte weeklyPresent = 0;
        for(byte[] day : attendance){
            byte sum = 0;
            double dailyPercentage = 0;
            for(byte hour : day){
                sum += hour;
                dailyPercentage = ((double) sum / 8) * 100;
            }
            System.out.println("Daily percentage: " + dailyPercentage);
            weeklyPresent += sum;
        }
        System.out.println("Weekly percentage: " + ( (double) weeklyPresent / (5*8)) * 100);
    }

    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B(2024503541) Question2 - Attendance\n");

        Attendance attendance = new Attendance();
        attendance.takeInput();
        attendance.calculatePercentage();
    }
}
