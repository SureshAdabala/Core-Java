import java.util.Scanner;
public class DashBoardAccess
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Name: ");
 String Name=sc.nextLine();
 String Dashboard=switch(Name.toLowerCase())
 {
 case "Student"->"lesser Dashboard Access";
 case "Pm" ->"Access Dashboard Access";
 case "sale" ->"Fully Access";
 default -> "Invalid Access";
 };System.out.println(Dashboard);
 }
}
