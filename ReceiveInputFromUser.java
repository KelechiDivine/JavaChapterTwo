package JHTP_CHPT2;

import java.util.Scanner;

public class ReceiveInputFromUser {
	public static void main (String[] args) {

		Scanner input = new Scanner (System.in);

		int x;
		int y;
		int z;
		int result;

		System.out.print("Enter a first number only =>");
		x = input.nextInt();

		System.out.print("Enter a second number only =>");
		y = input.nextInt();

		System.out.print("Enter a third number only =>");
		z = input.nextInt();

		result = x*y*z;

		System.out.printf("The product is:: %d%n", result);
	}
}