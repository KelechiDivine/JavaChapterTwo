package JHTP_CHPT2;//An application that collect input and finds the products,Average and sum

import java.util.Scanner;

public class SumOfNumbers {
	public static void main (String[] args) {
// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);

		int a;
		int b;
		int sum;

		System.out.print("Enter first integer =>");
		a = input.nextInt();

		System.out.println("Enter second integer =>");
		b = input.nextInt();

		sum = a+b;
		System.out.printf("The sum is => %d%n", sum);
	}
}

