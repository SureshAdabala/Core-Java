import java.util.*;
public class FactorialD
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        int i=1;
        long fact=1;
        do{
            fact*=i;
            i++;
        }while(i<=num);
        System.out.println("The Factorial of a Number is: "+fact);
    }
}
