import java.util.Scanner;
public class Eligibleforvoting
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:  ");
        int age=sc.nextInt();
        System.out.println("Enter ID: ");
        boolean id=sc.nextBoolean();
        if(age>=18)
        {
            System.out.println("Your age is eligible");
            if(id==true)
            {
                System.out.println("Your are eligible for voting");
            }
            else
            {
                System.out.println("You are not eligible Because you dont have a ID");
            }
        }
        else
        {
            System.out.println("Your are not eligible for voting");
        }
        
    }
}
