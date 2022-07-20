/*10.Write a java program to get the name from user and print 10 times
using loop.
*/

import java.util.Scanner;

public class P9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name :");
        String name = input.nextLine();

        for(int i=0;i<10;i++)
        {
           System.out.println("Your Name is :"+name);
        }
    }
}
