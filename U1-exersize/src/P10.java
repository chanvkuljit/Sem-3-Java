/*10.Write a java program to enter a number and find out sum of digits.*/

import java.util.Scanner;

public class P10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int Num,sum=0;
        System.out.print("Enter Digit value :");
        int num = input.nextInt();

        while (num>0)
        {
            Num=num%10;
            sum=sum+Num;
            num=num/10;
        }
        System.out.println("A sum of Given Digit is :"+sum);
    }
}
