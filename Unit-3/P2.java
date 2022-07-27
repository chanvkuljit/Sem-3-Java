/*2.Write a Java program to demonstrate use of multilevel inheritance.*/

class C1
{
    static void first()
    {
        System.out.println("First Class Is Called");
    }
}

class C2 extends C1
{
    static void second()
    {
        System.out.println("Second Class Is Called");
    }
}

class C3 extends C2
{
    static void third()
    {
        System.out.println("Third Class Is Called");
    }
}

public class P2
{
    public static void main(String[] args)
    {
        C3 H = new C3();

        H.first();
        H.second();
        H.third();
    }
}