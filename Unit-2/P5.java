/*Write a Java program to demonstrate use of this keyword.
*/

import java.util.Scanner;

class H2
{
  int i;
  float j;

    H2 (int i, float j)
  {
    this.i = i;
    this.j = j;
    
    System.out.println("A Addition of i & j :"+(i+j));
  }
}

public class P5
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);

    System.out.println ("Enter Value of I :");
    int mai = input.nextInt ();
    System.out.println ("Enter Value of J :");
    float ja = input.nextFloat ();
    H2 S = new H2 (mai,ja);
  }
}
