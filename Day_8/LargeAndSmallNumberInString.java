class LargeAndSmallNumberInString
{
 public static void main(String[] args)
 {
 String st="2536489";
 char larg=st.charAt(0);
 char small=st.charAt(0);
 for(int i=0;i<st.length();i++)
 {
 if(st.charAt(i)>larg)
 {
 larg=st.charAt(i);
 }
 if(st.charAt(i)<small)
 {
 small=st.charAt(i);
 }
 }System.out.println("Largest Number is: "+larg);
 System.out.println("Smallest Number is: "+small);
 }
}
