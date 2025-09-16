public class method {
 public static void main(String[] args) {
 printEvennumber(1,10);
 printEvennumber(11,20);
 }
 static void printEvennumber(int a, int b)
 {
 for(int i=a;i<=b;i++)
 {
 if(i%2==0) System.out.println("Even Numbers are : "+i);
 }
 System.out.println();
 };
}