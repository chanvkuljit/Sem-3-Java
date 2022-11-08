/*9. Write a Java program to set Thread name and priority & test it.*/

class Main extends Thread
{

  public void run ()
  {

    System.out.println ("running...");

  }
  public static void main (String args[])
  {

    Main t1 = new Main ();

    Main t2 = new Main ();

    System.out.println ("Name of t1:" + t1.getName ());

    System.out.println ("Name of t2:" + t2.getName ());


    t1.start ();

    t2.start ();


    t1.setName ("marwadi university");

    System.out.println ("After changing name of t1:" + t1.getName ());

  }
}
