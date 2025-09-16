
public class ReverseString
{
 public static void main(String[] args)
 {
 String st="Suresh";
 for(int i=0;i<st.length();i++)
 {
 System.out.print(st.charAt(i));
 }
 System.out.println(" ");
 for(int x=(st.length())-1;x>=0;x--)
 {
 System.out.print(st.charAt(x));
 }
 }
}