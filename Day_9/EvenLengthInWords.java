class EvenLengthInWords
{
 public static void main(String[] args)
 {
 String st="I am from Andhra Pradesh";
 String i[]=st.split(" ");
 for(int x=0;x<i.length;x++)
 {
 if(i[x].length()%2==0)
 {
 System.out.println(i[x]);
 }
 }
 }
}
