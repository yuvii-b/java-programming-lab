package week1;

import java.util.Scanner;

// Question 4
public class Marks{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark for three subjects: ");
		float m1 = sc.nextFloat();
		float m2 = sc.nextFloat();
		float m3 = sc.nextFloat();
		float tot = m1 + m2 + m3, avg = tot / 3;
		boolean pass = m1 >= 50 && m2 >= 50 && m3 >= 50;
		char grade = ' ';
		if(!pass) grade = 'U';
		else if(avg >= 90) grade = 'S';
		else if(avg >= 80) grade = 'A';
		else if(avg >= 70) grade = 'B';
		else if(avg >= 60) grade = 'C';
		else grade = 'D';
		System.out.printf("Total: %.2f\nAvg: %.2f\nGrade: %c\nPass Status: %b\n", tot, avg, grade, pass);
	}
}