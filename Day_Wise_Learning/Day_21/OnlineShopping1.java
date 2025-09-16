//Online Shopping - Payment System
class OnlineShopping {
    //Credit or Debit Card
    void makePayment(String cardNumber,String cvv) {
        System.out.println("----Payment through card----");
        System.out.println("Your Card Number is :"+cardNumber);
        System.out.println("CVV Number : "+cvv);
    }
    //UPI Id
    void makePayment(String upiId) {
        System.out.println("----Payemnt through UPI Id----");
        System.out.println("Your UPI ID: "+upiId);
    }
    //Wallet Payment
    void makePayment(String walletId, double amount) {
        System.out.println("----Payment Through Wallet----");
        System.out.println("Wallet ID is: "+walletId);
        System.out.println("Amount is: "+amount);
    }
    //Net-Banking
    void makePayment(String bankAccount, String ifsc, double amount) {
        System.out.println("----Payment Through Net-Banking----");
        System.out.println("Bank account number : "+bankAccount);
        System.out.println("IFSC number is : "+ifsc);
        System.out.println("Amount is : "+amount);
    }
}
public class OnlineShopping1 {
    public static void main(String[] args) {
        OnlineShopping shop=new OnlineShopping();
        shop.makePayment("8651 6523 5632 5562","563");
        System.out.println();
        shop.makePayment("8563254123@ybl");
         System.out.println();
        shop.makePayment("56324",536);
         System.out.println();
        shop.makePayment("0296101000116325","UBIN53245",5324);
    }
}
