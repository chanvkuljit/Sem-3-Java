/*7. Write a Java Program to enter three nos. and find maximum out of it.*/
import java.util.Scanner;

public class P7
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);

        System.out.println("Enter Value of Number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter value of Number 2:");
        int num2 = input.nextInt();

        if(num1<num2)
        {
            System.out.println("The First Number is Smallest Digit");
        }

        else
        {
            System.out.println("The Second Number is Smallest Digit");
        }
    }
}
