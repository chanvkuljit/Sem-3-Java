/*4. Write a java program to get personal information from user and display 
on screen.*/

import java.util.Scanner;

public class P4
{
    public static void main (String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Your Name :");
        String name = input.nextLine();
        System.out.print("Enter Your Age :");
        int age =input.nextInt();
        System.out.print("Enter Your Number :");
        long num =input.nextLong();
        System.out.print("Enter Your City Name :");
        String city = input.next();
        
        System.out.println("----------------------------------");
        System.out.println("A Name is "+name);
        System.out.println("A Age is :"+age);
        System.out.println("A Number is :"+num);
        System.out.println("A City is :"+city);
    }
}