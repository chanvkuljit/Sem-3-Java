/*3.Write a Java program to demonstrate use of Hierarchical inheritance*/

class I1
{
    void first()
    {
        System.out.println("First Class Is Called");
    }
}

class I2 extends I1
{
    void second()
    {
        System.out.println("Second Class Is Called");
    }
}

class I3 extends I1
{
    void third()
    {
        System.out.println("third Class Is Called");
    }
}

public class P3
{
    public static void main(String[] args)
    {
        I3 h = new I3();
        I2 j = new I2();

        h.first();
        j.second();
        h.third();
    }
}