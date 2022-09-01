final class example
{
    int num;
    
    final void input()
    {
        num=143;
    }

    void display()
    {
        System.out.println(num);
    }
}

   
public class P6
{
    public static void main (String[] args) 
    {
        example e = new example();
        
        e.input();
        e.display();
    }
}
