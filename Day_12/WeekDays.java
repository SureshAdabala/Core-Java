import java.util.Scanner;
public class WeekDays
{

 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Day Number: ");
 int DayNumber=sc.nextInt();
 String DayName=switch(DayNumber)
 {
 case 1->"Monday";
 case 2->"Tuesday";
 case 3->"Wednesday";
 case 4->"Thursday";
 case 5->"Friday";
 case 6->"Saturday";
 default ->"Invalid";
 };System.out.println(DayName);
 }
}
