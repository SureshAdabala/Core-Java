package Looping_Through_String_Problems;
class CountingValues
{
 public static void main(String[] args)
 {
 String st="65BatchSuresh".toLowerCase();
 int countVowels=0;
 int countConsonents=0;
 int countA=0;
 int countN=0;
 for(int i=0;i<st.length();i++)
 {
 if(st.charAt(i)>='a' && st.charAt(i)<='z')
 {
 countA++;
 }
 if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' ||
st.charAt(i)=='u')
 {
 countVowels++;
 }
 else if(st.charAt(i)>='0' && st.charAt(i)<='9')
 {
 countN++;
 }
 else
 {
 countConsonents++;
 }
 } System.out.println("number of Vowels:" + countVowels);
 System.out.println("number of Consonents:" + countConsonents);
 System.out.println("number of Numerics:" + countN);
 System.out.println("number of Alphabets:" + countA);
 }
}
