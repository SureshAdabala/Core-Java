
class CountCases
{
 public static void main(String[] args)
 {
 String st="SuReSh";
 int lowercase=0;
 int uppercase=0;
 for(int i=0;i<st.length();i++)
 {
 if(Character.isUpperCase(st.charAt(i)))
 {
 uppercase++;
 }
 if(st.charAt(i)>='A' && st.charAt(i)<='Z')
 {
 lowercase++;
 }
 } System.out.println("no of Uppercase:"+uppercase);
 System.out.println("no of Lowercase:"+lowercase);

 }
}

