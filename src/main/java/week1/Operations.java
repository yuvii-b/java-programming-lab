package week1;

import java.util.Scanner;

//Question 1
public class Operations{
	public static void main(String[] args){
		int a, b, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		a = sc.nextInt();
		System.out.print("Enter the second number: ");
		b = sc.nextInt();
		System.out.print("Enter the operator(+,-,*,/): ");
		char op = sc.next().charAt(0);		
		if(op == '+') result = a + b;
		else if(op == '-') result = a - b;
		else if(op == '*') result = a * b;
		else if(op == '/'){
			if(b == 0){
				System.out.println("Division by zero not possible");
				return;
			}
			result = a / b;
		}
		else System.out.println("Invalid operator provided");
		System.out.println("Result is: " + result);
	}	
}