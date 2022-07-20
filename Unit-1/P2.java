/*2. Write a Java Program to enter two nos. and perform all 5 mathematical 
operations*/

import java.util.Scanner;

public class P2
{
    public static void main (String[] args) 
    {
        
        Scanner input =new Scanner(System.in);
        
        System.out.print("Enter value of A:");
        int num =input.nextInt();
        System.out.print("Enter value of B:");
        int num1 =input.nextInt();
        
        System.out.println("A :"+num);
        System.out.println("B :"+num1);
        
        System.out.println("Addition of A and B:"+(num+num1));
        System.out.println("Subtration of A and B:"+(num-num1));
        System.out.println("Multiplex of A and B:"+(num*num1));
        System.out.println("divition of A and B:"+(num/num1));
        
    }
}