//Adding,subtract,multiply
class Calculator2 {
    //Adding
     void add(int...numbers) {
        int sum=0;
        for(int i=0;i<numbers.length;i++) {
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
    
    void add(double a,double b) {
        System.out.println("Total is : "+(a+b));
    }
   
    void add(String a,String b) {
        System.out.println(a+b);
    }
    //Subtract
    void subtract(int a, int b) {
        System.out.println(a-b);
    }
    void subtract(double a, double b) {
        System.out.println(a-b);
    }
    void subtract(int a,int b,int c) {
        System.out.println(a+b+c);
    }
    //Multiply
    void multiply(int a,int b) {
        System.out.println(a*b);
    }
    void multiply(double a,double b) {
        System.out.println(a*b);
    }
    void multiply(int a,int b,int c) {
        System.out.println(a*b*c);
    }
}
public class cal2 {
    public static void main(String[] args) {
        Calculator2 myCal=new Calculator2();
        myCal.add(65,23,56);
        myCal.subtract(36,53);
        myCal.multiply(56,5,2);
        myCal.add("Suresh","Adabala");
    }
}
