package week1;

import java.util.Scanner;

// Question 3
public class BMIStatus{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean status;
		System.out.print("Enter the weight in kgs: ");
		double weight = sc.nextDouble();
		System.out.print("Enter the height in meters: ");
		double height = sc.nextDouble();
		double bmi = weight / (height * height);
        status = bmi >= 18.5 && bmi <= 25;
		System.out.printf("BMI: %.2f BMI status: %b", bmi, status);
	}
}