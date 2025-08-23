import java.util.Scanner;
public class ArmStrongOrNotNormalWay
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Number: ");
 int n=sc.nextInt();
 int m=n;
 int m1=m;
 int count=0;
 while(n>0)
 {
 n=n/10;
 }
 int sum=0;
 while(m>0)
 {
 int temp=m%10;
 sum=sum+(temp*temp*temp);
 m=m/10;
 }
 if(sum==m1)
 {
 System.out.println(m1+" is a Armstrong number");
 }
 else
 {
 System.out.println(m1+" is not a Armstrong number");
 }
 }}
