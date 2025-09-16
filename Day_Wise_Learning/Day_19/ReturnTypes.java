public class ReturnTypes {
 public static void main(String[] args) {
 add2Numbers(5,2);
 subtractnumbers2(6,4);
 }
 static void add2Numbers(int a, int b)
 {
 int res=a+b;
 System.out.println(res);
 }
 static int subtractnumbers2(int a, int b)
 {
 int res=a-b;
 return res;
 }
}

