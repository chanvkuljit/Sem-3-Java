/*5. Write a Java Program to enter marks of 3 subjects and find total, 
percentage, result and class.
*/
import java.util.Scanner;

public class P5
{
    public static void main (String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Your Roll No :");
        int num = input.nextInt();
        System.out.println("Enter Your Subject-1 Mark :");
        int s1 = input.nextInt();
        System.out.println("Ente Your Subject-2 Mark :");
        int s2 = input.nextInt();
        System.out.println("Enter Your Subject-3 Mark :");
        int s3 = input.nextInt();
        
        int total=0;
        total=s1+s2+s3;
        
        
        System.out.println("-----------------------------------------");
        System.out.println("A Total Of 3 Subject is :"+total);
        
        int per=0;
        per=total/3;
        
        System.out.println("A Percentage is :"+per);
        
        
        if(total<100)
        {
            System.out.println("Student is Fail");
        }
        
        else
        {
            System.out.printf("\nStudent is pass with %d Percentage",per);
            
        }
        
        if(total<100)
        {
            System.out.println("\nStudent Get C Class");
        }
        
        else if(total<=150)
        {
            System.out.println("\nStudent Get B Class");
        }
        
        else
        {
            System.out.println("\nGet A Class");
        }
    }
}