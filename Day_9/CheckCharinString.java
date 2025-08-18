class CheckCharinString
{
 public static void main(String[] args)
 {
 String st="Suresh".toLowerCase();
 char ch='s';
 for(int i=0;i<st.length();i++)
 {
 if(st.charAt(i)==ch)
 {
 System.out.println("Character exists in position "+i);
 }
 }
 }
}