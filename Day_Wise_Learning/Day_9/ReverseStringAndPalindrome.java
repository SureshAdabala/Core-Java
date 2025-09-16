class ReverseStringAndPalindrome
{
 public static void main(String[] args)
 {
 String st1="Suresh";
 String st2="";
 for(int i=st1.length()-1;i>=0;i--)
 {
 st2=st2+st1.charAt(i);
 }
 if(st2.equals(st1))
 {
 System.out.println("palindrome");
 }
 else
 {
 System.out.println("not a palindrome");
 }
 }
}