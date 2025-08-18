class WordsInString
{
 public static void main(String[] args)
 {
 //1st Way
 String st=("we are from andhra pradesh");
 String i[]=st.split(" ");
 System.out.println("No of Words: "+i.length);
 
 
 
 //2nd Way
 int countW=0;
 for(int x=0;x<st.length();x++)
 {
 if(st.charAt(x)==' ')
 {
 countW++;
 }
 }System.out.println("No. of Words:"+(countW+1));
 }
}