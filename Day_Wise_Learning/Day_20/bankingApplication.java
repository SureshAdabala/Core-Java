class BankAccount {
    static String name="Union Bank of India";
    static String address="Kanuru Branch";
    static double interest=0.10;
    int balance=1000;
    public static void bankDetails() {
        System.out.println("--Bank Details--");
        System.out.println(name+" is located in "+address);
    }
    public static void interestDetails() {
        System.out.println("--Interest Details--");
        System.out.println("Interest is: "+interest*100);
    }
    public void checkBalance() {
        System.out.println("--Current Bank Balance--");
        System.out.println("Your Bank Balance is: "+ balance);
    }
    void deposit(int amount) {
        balance=balance+amount;
        System.out.println(amount+" has been credited");
    }
    void withdraw(int amount) {
        if(amount<balance) {
            balance=balance-amount;
            System.out.println(amount+" has been debited");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
    
}
public class bankingApplication {
    public static void main(String[] args)
    {
        BankAccount.bankDetails();
        System.out.println();
        BankAccount.interestDetails();
        System.out.println();
        
        BankAccount obj=new BankAccount();
        obj.checkBalance();
        System.out.println();
        obj.deposit(500);
        System.out.println();
        obj.withdraw(200);
        System.out.println();
        obj.checkBalance();
    }
}
