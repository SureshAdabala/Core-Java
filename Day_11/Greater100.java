import java.util.Scanner;
public class Greater100
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int val=sc.nextInt();
        if(val>100)
        {
            System.out.println(val+" is Greater than Hundred");
        }
        else 
        {
            System.out.println(val+" is not Greater than Hundred");
        }
    }
}
