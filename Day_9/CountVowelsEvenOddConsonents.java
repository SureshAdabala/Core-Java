class CountVowelsEvenOddConsonents
{
 public static void main(String[] args)
 {
 String st="Programs1245".toLowerCase();
 int countV=0;
 int countC=0;
 int countE=0;
 int countO=0;
 for(int i=0;i<st.length();i++)
 {
 if(st.charAt(i)>='a' && st.charAt(i)<='z')
 {
 if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i'|| st.charAt(i)=='o' ||
st.charAt(i)=='u')
 {
 countV++;
 }
 else
 {
 countC++;
 }
 }
 if(st.charAt(i)>='0' && st.charAt(i)<='9')
 {
 if(st.charAt(i)%2==0)
 {
 countE++;
 }
 else
 {
 countO++;
 }
 }
 }System.out.println("No of Vowels: "+countV);
 System.out.println("No of Consonents: "+countC);
 System.out.println("No of Even Numbers: "+countE);
 System.out.println("No of Odd Numbers: "+countO);
 }
}
