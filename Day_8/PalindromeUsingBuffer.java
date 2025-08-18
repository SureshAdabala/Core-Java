package String_Builder_and_Buffer;
class PalindromeUsingBuffer
{
 public static void main(String[] args)
 {
 String st="Amma";
 StringBuffer s1=new StringBuffer(st);
 String st1=s1.reverse().toString();
 if(st.equalsIgnoreCase(st1))
 {
 System.out.println("It is a Palindrome");
 }
 else
 {
 System.out.println("It is not a Palindrome");
 }
 }
}
