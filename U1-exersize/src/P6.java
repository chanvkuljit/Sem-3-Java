/*6. Write a Java program to enter two nos. and find maximum out of it.*/

import java.util.Scanner;

public class P6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value of Number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter value of Number 2:");
        int num2 = input.nextInt();

        if(num1>num2)
        {
            System.out.println("The First Number is Biggest Digit");
        }

        else
        {
            System.out.println("The Second Number is Biggest Digit");
        }
    }
}
