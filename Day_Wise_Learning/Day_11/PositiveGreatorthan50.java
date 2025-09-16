import java.util.Scanner;
public class PositiveGreatorthan50
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value:  ");
        int val=sc.nextInt();
        if(val>0)
        {
            if(val>50)
            {
                System.out.println(val+" is Greater than 50");
            }
            else
            {
                System.out.println(val+ " is positive but not greater 50");
            }
        }
        else 
        {
            System.out.println(val+ " is Negative Number");
        }
    }
}
