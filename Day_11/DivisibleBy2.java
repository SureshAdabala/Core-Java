import java.util.Scanner;
public class DivisibleBy2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int val=sc.nextInt();
        if(val%2==0)
        {
            System.out.println(val+" is divivle by 2");
        }
        else 
        {
            System.out.println(val+" is not divible by 2");
        }
    }
}
