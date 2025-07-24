package week1;

import java.util.Scanner;

// Question 2
public class TeamStatus{
	public static void main(String[] args){
		int points;
		byte fouls;
		boolean status;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter team points: ");
		points = sc.nextInt();
		System.out.print("Enter team fouls: ");
		fouls = sc.nextByte();
        status = points >= 50 && fouls <= 5;
		System.out.println("Team points: " + points);
		System.out.println("Team fouls " + fouls);
		System.out.println("Winning status: " + status);
	}	
}