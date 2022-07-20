/*2.Write a Java program to demonstrate use of pass objects to methods.
*/

import java.util.Scanner;

public class P2
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);

      System.out.println ("Enter Value Of A :");
    int a = input.nextInt ();
      System.out.println ("Enter Value of B :");
    int b = input.nextInt ();

      Addition (a, b);
  }

  static void Addition (int a, int b)
  {
    System.out.println ("A Addition of A & B is :" + (a + b));
  }
}
