/*8. Write a Java Program to enter 10 Nos. and find sum and average of it.*/

import java.util.Scanner;

public class P8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] aaray = new int[10];
        int total = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("\nEnter Value :");
            aaray[i] = input.nextInt();

            total += aaray[i];
        }

        System.out.printf("A Total of 10 Digit is : %d",total);

        int sum=0;

        sum=total/10;
        System.out.println("\nA Average of 10 Digit is :"+sum);


    }

}
