import java.util.Scanner;
public class CheckpositivenegativeorZero
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int val=sc.nextInt();
        if(val%2==0)
        {
            System.out.println(val+" is Positive");
        }
        else if(val==0)
        {
            System.out.println(val+" is equal to zero");
        }
        else
        {
            System.out.println(val+" is  Negative");
        }
    }
}
