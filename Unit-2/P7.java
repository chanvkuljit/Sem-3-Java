/*7.Write a Java program to demonstrate use of Overloading of Constructor.
 */

class G7
{
    double height, width,base;
    
    G7(double h,double w,double b)
    {
        height=h;
        width=w;
        base=b;
    }
    G7()
    {
        height = width = base =0;
    }
    G7(double pi)
    {
        height = width = base = pi;
    }

    double diplay()
    {
        return height*width*base;
    }
}
public class P7
{
    public static void main(String[] args)
    {
        G7 s1 = new G7(10.5,11.6,11.6);
        G7 s2 = new G7();
        G7 s3 = new G7(19.7);

        double vol = s1.diplay();
        System.out.println("A Sum :"+vol);

        vol=s2.diplay();
        System.out.println("A Sum :"+vol);

        vol=s3.diplay();
        System.out.println("A Sum :"+vol);
    }
}
