public class Fibonacci {
 public static void main(String[] args)
 {
 int a=0,b=1;
 int c=0;
 System.out.print("Fibonacci Series: ");
 for(int i=0;i<=10;i++)
 {
 System.out.print(a+" ");
 c=a+b;
 a=b;
 b=c;
 }
 }
}
