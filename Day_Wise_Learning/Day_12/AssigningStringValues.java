import java.util.Scanner;
public class AssigningStringValues
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Month: ");
 int monthNumber=sc.nextInt();
 String monthName= " ";
 switch(monthNumber)
 {
 case 1:
 monthName="January";
 break;
 case 2:
 monthName="February";
 break;
 }System.out.println(monthName);
 }
}