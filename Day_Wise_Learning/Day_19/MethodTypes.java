public class MethodTypes{
 public static void main(String[] args) {
 method1();
 MethodTypes obj=new  MethodTypes();
 obj.method2();
 }
 //Static method
 static void method1() {
 System.out.println("Static method 1");
 };
 //non-static method
 void method2() {
 System.out.println("Non-Static method");
 };
 //another non-static method
 void method3() {
 method2();
 System.out.println("Another non-static method");
 };
}