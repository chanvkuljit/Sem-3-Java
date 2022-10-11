/*2. Write a Java program to implement Arithmetic Exception */

public class P2
{
    public static void main(String[] args) 
    {
        try 
        {
            int data=100/0;
        } 
        catch (ArithmeticException e) 
        {
            System.out.println(e);  
        }
        
        System.out.println("rest of code do here");
    }
}
