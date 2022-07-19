/*3. Write a Java Program to enter Principle Amt., Rate of Interest and No. 
of Years and find Simple Interest.*/

import java.util.Scanner;

public class P3
{
        public static void main (String[] args)
        {
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter a Amount :");
            int amount = input.nextInt();
            System.out.println("Enter a Rate :");
            int rate = input.nextInt();
            System.out.println("Enter a Number of Year :");
            int nyear = input.nextInt();
            
            System.out.println("A Simple Interest of Given Date is below :");
            System.out.println((amount+rate+nyear)/100);
        
        }
}