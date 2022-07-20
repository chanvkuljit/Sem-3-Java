/*6.Write a Java program to demonstrate use of Method Overloading.*/

import java.util.Scanner;
public class P6
{
    static int Addition(int x,int y)
    {
        return(x+y);
    }
    static double Addition(double x,double y)
    {
        return(x+y);
    }


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int S1=Addition(3,4);
        double S2= Addition(2.5,3.2);
        System.out.print("A integer Addition is :"+S1);
        System.out.print("\nA double Addition is :"+S2);
    }

}
