/*7. Write a Java program to create a thread using Thread Class*/

class P7 extends Thread
{
  public void run ()
  {
    System.out.println ("thread is running...");
  }
  public static void main (String args[])
  {
    P7 func1 = new P7 ();
    func1.start ();
    P7 func2 = new P7 ();
    func2.start ();
  }
}
