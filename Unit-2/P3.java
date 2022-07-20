//3.

import java.util.Scanner;

public class P3
{
  Scanner input = new Scanner (System.in);

    Main ()
  {
    System.out.println ("Enter Value Of A : ");
    int a = input.nextInt ();
      System.out.println ("Enter Value of B : ");
    int b = input.nextInt ();
      System.out.println ("Addition of A & B is : " + (a + b));
  }

  public static void main (String[]args)
  {
    Main m = new Main();
  }
}
