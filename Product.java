package JHTP_CHPT2;

import java.util.Scanner;

public class Product {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);


        int a;
        int b;
        int c;
        int sum;
        int product;
        int Average;


        System.out.print("Enter first integer =>");
        a = input.nextInt();

        System.out.print("Enter second integer =>");
        b = input.nextInt();

        System.out.print("Enter third integer =>");
        c = input.nextInt();

        sum = a+b+c;
        System.out.printf("The sum of these numbers => %d%n",sum);

        product = a*b*c;
        System.out.printf("The product of these numbers => %d%n", product);

        Average = (a+b+c)/3;
        System.out.printf("The Average of these numbers => %d%n", Average);


    }
}





