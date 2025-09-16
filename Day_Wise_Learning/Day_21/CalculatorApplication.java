class Calculator {
    void add(int item1,int item2) {
        int res=item1+item2;
        System.out.println(res+" kg has been purchased");
    }
    void add(double bill1,double bill2) {
        double total=bill1+bill2;
        System.out.println("Total Bill is : "+total);
    }
    void add(int item1,int item2,int item3) {
        int res=item1+item2+item3;
        System.out.println(res+" kg has been purchased");
    }
    void add(double bill1,double bill2, double bill3) {
        double total=bill1+bill2+bill3;
        System.out.println("Total Bill is : "+total);
    }
}
public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        calc.add(19,29);
        calc.add(156.87,282.62);
        calc.add(56,54,32);
        calc.add(532.25,23.12,216.23);
    }
}
