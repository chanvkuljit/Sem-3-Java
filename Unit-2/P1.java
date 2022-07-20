/*1.Write a Java program to demonstrate use of Class and Methods.*/

class Greeting
{
  public static void Hello ()
  {
    System.out.println ("How are You!!");
  }
}

public class P1
{
  public static void Hello ()
  {
    System.out.println ("Hello Guy!!");
  }

  public static void main (String[]args)
  {
    Hello ();
    Greeting S1 = new Greeting ();
    S1.Hello ();
  }
}
