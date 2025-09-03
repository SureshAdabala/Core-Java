//Bank Application 
class BankApplication {
    //Cash Deposit
     void deposit(int amount) {
         System.out.println("---Cash Deposit---");
         System.out.println("Amount is : "+amount);
     }
     //Cheque Deposit
      void deposit(int amount,String chequeNumber) {
         System.out.println("---Cheque Deposit---");
         System.out.println("Amount is: "+amount);
         System.out.println("Cheque Number is: "+chequeNumber);
     }
     //UPI/Online Transfer
     void deposit(int amount, String upiId, String referenceId) {
         System.out.println("---UPI Id (or) Online Transfer---");
         System.out.println("Ampunt is: "+amount);
         System.out.println("Upi Id: "+upiId);
         System.out.println("Reference Id: "+referenceId);
     }
     //Normal Withdrawal
     void withdraw(int amount) {
         System.out.println("---Normal Withdrawal---");
         System.out.println("Ampunt is: "+amount);
     }
     //ATM Withdrawal
     void withdraw(int amount,String atmCardNumber) {
         System.out.println("---ATM Withdrawal---");
         System.out.println("Ampunt is: "+amount);
         System.out.println("ATM Card Number is: "+atmCardNumber);
     }
}
public class BankApplication1 {
    public static void main(String[] args) {
        BankApplication bank=new BankApplication();
        bank.deposit(2531);
        System.out.println();
        bank.deposit(423,"5689745234");
        System.out.println();
        bank.deposit(2324,"9856324553@sbi","ID554123649");
        System.out.println();
        bank.withdraw(5231);
        System.out.println();
        bank.withdraw(1232,"5364 5236 8697 4531");
    }
}
