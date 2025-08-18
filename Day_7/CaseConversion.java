public class CaseConversion
{
 public static void main(String[] args)
 {
 String st="SuReShJaVa65";
 String Suresh=" ";
 for(int i=0;i<st.length();i++)
 {
 if(st.charAt(i)>='a' && st.charAt(i)<='z')
 {
 Suresh+=Character.toUpperCase(st.charAt(i));
 }
 else if(st.charAt(i)>='A' && st.charAt(i)<='Z')
 {
 Suresh+=Character.toLowerCase(st.charAt(i));
 }
 else
 {
 Suresh+=st.charAt(i);
 }
 }
 System.out.println(st);
 System.out.println(Suresh);
 }
}

