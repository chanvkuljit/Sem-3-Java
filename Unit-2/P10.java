/*10.Write a Java program to demonstrate use of varargs.*/

public class P10
{
    static void value(String...value)
    {
        System.out.println("Value Method invoked");
        for(String s:value)
        {
            System.out.println(s);
        }
    }

    public static void main(String[] args)
    {
        value();
        value("hello world","hey");

    }
}
