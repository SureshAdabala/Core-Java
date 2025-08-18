class SwapLastAndFirstChar
{
 public static void main(String[] args)
 {
 String st1="Suresh";
 char arr[]=st1.toCharArray();
 char first;
 first=arr[0];
 char last;
 last=arr[arr.length-1];
 char swap;
 swap=first;
 first=last;
 last=swap;
 System.out.println(first);
 System.out.println(last);
 }
}