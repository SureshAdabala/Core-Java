class Calculator {
    void add(int...items) {
        int sum=0;
        for(int i=0;i<items.length;i++) {
            sum=sum+items[i];
        }
        System.out.println("Total Kgs: "+sum);
    }
    void add(double...bills) {
        double total=0;
        for(int j=0;j<bills.length;j++) {
            total=total+bills[j];
        }
        System.out.println("your total bill is: "+total);
    }
}
public class CalculatorApplicationusingArray {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        calc.add(19,29);
        calc.add(156.87,282.62);
        calc.add(56,54,32);
        calc.add(532.25,23.12,216.23);
    }
}
