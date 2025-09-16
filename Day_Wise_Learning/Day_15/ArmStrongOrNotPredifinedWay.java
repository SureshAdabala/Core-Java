import java.util.Scanner;
public class ArmStrongOrNotPredifinedWay
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Number: ");
 int n=sc.nextInt();
 int m=n;
 int count=String.valueOf(n).length();
 double sum=0;
 while(m>0)
 {
 int temp=m%10;
 sum=sum+Math.pow(temp, count);
 m=m/10;
 }
 if(sum==n)
 {
 System.out.println(n+" is an Armstrong number");
 }
 else
 {
 System.out.println(n+" is not an Armstrong number");
 }
 }
}
