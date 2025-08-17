package String_Builder_and_Buffer;
class StringBUilder
{
 public static void main(String[] args)
 {
 StringBuilder s1=new StringBuilder("Java ");
 s1.append("Programmer");//add to the end of the string
 s1.insert(5,"Python");//Add the at the own position
 s1.deleteCharAt(4);//delete the single character
 s1.delete(5,11);//delete the range of characters
 s1.setCharAt(1,'@');//replace the character
 s1.replace(0,4,"Frontend");//replace the range of characters
 s1.reverse();//Reverse the string
 System.out.println(s1);
 System.out.println(s1.length());
 System.out.println(s1.charAt(11));
 System.out.println(s1.capacity());
 System.out.println(s1.indexOf("va"));
 System.out.println(s1.lastIndexOf("a"));
 System.out.println(s1.substring(0,5));

 s1.ensureCapacity(67);//we can change the default value of capacity in String Buffer
 System.out.println(s1.capacity());
 }
}
