package JHTP_CHPT2;

import java.util.Scanner;

public class Assignment{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);


        int a;
        int b;


        System.out.print("Enter first number =>");
        a = input.nextInt();

        System.out.print("Enter second number =>");
        b = input.nextInt();



        if (a < b) {

            //if a is less than b let the condition be false
            //if b is greater than a then let the condition be true
            System.out.print(b);

        }
        else {
            System.out.println(a);

        }


        if (a == b) {
            System.out.print("The number are equal");

        }
        else {
            System.out.println();
        }
    }

}
