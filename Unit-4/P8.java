/*8. Write a Java program to create a thread using Runnable*/

class P8 implements Runnable
{
  
public void run ()
  {
    
System.out.println ("thread is running...");
  
} 

public static void main (String args[])
  {
    
Main m1 = new Main ();
    
Thread t1 = new Thread (m1);	// Using the constructor Thread(Runnable r)  
    t1.start ();

} 
}
