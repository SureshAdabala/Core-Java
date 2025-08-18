import java.util.Scanner;
public class ComparingTwoStrings
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String st1=sc.nextLine();
        System.out.println("Enter String 2: ");
        String st2=sc.nextLine();
        if(st1.equals(st2))
        {
            System.out.println("Both are equal");
        }
        else 
        {
            System.out.println("Both are not equal");
        } 
    }
}
