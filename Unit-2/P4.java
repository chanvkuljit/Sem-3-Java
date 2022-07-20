/*4.Write a Java program to demonstrate use of parameterised constructor*/

import java.util.Scanner;

class H1
{
  H1 (int i, float j)
  {
    System.out.println ("A Addition of I & J :" + (i + j));
  }
}

public class P4
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);

      System.out.println ("Enter Value of I :");
    int may = input.nextInt ();
      System.out.println ("Enter Value of J :");
    float Ja = input.nextFloat ();
    H1 S = new H1 (may, Ja);
  }
}
