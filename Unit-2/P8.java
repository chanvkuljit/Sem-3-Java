/*8. Write a Java program to demonstrate use of static block.*/

public class P8
{
    static
    {
        System.out.println("the static block is called");
    }

    public static void main(String[] args)
    {
        System.out.println("this output come from main function");
    }
}
