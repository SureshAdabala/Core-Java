class AddCharInStartInString
{
 public static void main(String[] args)
 {
 //normal Way
 String st="Suresh";
 char ch='6';
 System.out.println(ch+st);
 //using StringBuffer
 StringBuffer st1=new StringBuffer(st);
 st1.insert(6,"6");
 System.out.println(st1);
 }
}