/*Write a Java program to demonstrate use of nested classes.
 */

class hello
{
    static int i=0;

    static class greeting
    {
        void display()
        {
            System.out.println("a Value of I :"+i);

            int x=9;

            System.out.println("A value of X :"+x);
        }
    }
}

public class P9
{
    public static void main(String[] args)
    {
      hello.greeting m = new hello.greeting();
      m.display();
    }
}
