/*1. Write a Java program to perform simple inheritance. */

class H1
{
    static void display()
    {
        System.out.println("First Class Called");
    }
}

class H2 extends H1
{
    static void output()
    {
        System.out.println("Second class Called");
    }

}

public class P1
{
    public static void main(String[] args)
    {
        H2 H = new H2();

        H.display();
        H.output();
    }
}
