
public class SumOfNumbers
{
 public static void main(String[] args)
 {
 String st="123456";
 int sum=0;
 int sumeven=0;
 int sumodd=0;
 for(int i=0;i<st.length();i++)
 {
 sum+=Character.getNumericValue(st.charAt(i));
 if(i%2==0)
 {
 sumeven+=Character.getNumericValue(st.charAt(i));

 }
 if(i%2==1)
 {
 sumodd+=Character.getNumericValue(st.charAt(i));

 }
 } System.out.println("Sum of All:"+sum);
 System.out.println("Sum of Even:"+sumeven);
 System.out.println("Sum of Odd:"+sumodd);
 }
}
