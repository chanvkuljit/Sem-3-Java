/*3.Write a Java program to demonstrate use of constructor.
*/

import java.util.Scanner;

public class P3
{
  Scanner input = new Scanner (System.in);

    P3()
  {
    System.out.println ("Enter Value Of A : ");
    int a = input.nextInt ();
      System.out.println ("Enter Value of B : ");
    int b = input.nextInt ();
      System.out.println ("Addition of A & B is : " + (a + b));
  }

  public static void main (String[]args)
  {
    P3 m = new P3();
  }
}
