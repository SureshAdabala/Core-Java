class Ajio {
    static String platformName="Ajio";
    static int year=2016;
    
    String productName1,productName2,productName3;
    String deliveryAddress;
    static void platformDetails() {
        System.out.println("-----Platform Details-----");
        System.out.println("Platfrom name is: "+platformName);
        System.out.println(platformName+" is launched Globally "+year);
    }
    static void termsAndConditions() {
        System.out.println("-----Rules for Shopping------");
        System.out.println("1. Login Authentication Required to by an item");
        System.out.println("2. Check your cart items before order");
    }
    static void deliveryOptions() {
        System.out.println("-----Delivery Modes-----");
        System.out.println("A. Cash on Delivery");
        System.out.println("B. UPI Payments are Availble");
        System.out.println("C. Debit/Credit card Payment Available");
        System.out.println("D. EMI Availble");
    }
    void addProduct(String name1,String name2,String name3) {
        productName1=name1;
        productName2=name2;
        productName3=name3;
        System.out.println(productName1+" is added to the Cart");
        System.out.println(productName2+" is added to the Cart");
        System.out.println(productName3+" is added to the Cart");
    }
    void viewCart() {
        System.out.println("-----Items in the Cart-----");
        System.out.println("1. "+productName1+" \n2. "+productName2+" \n3. "+productName3);
    }
    void placeOrder(String address) {
        deliveryAddress=address;
        System.out.println("Add the Delivery Address: "+deliveryAddress+" \nAnd Place the order");
    }
    void trackOrder() {
        System.out.println("-----Order Details-----");
        System.out.println("1. Order Confirmed \n2. Shipped \n3. Out of Delievery \n4. Delivered");
    }
}
public class EcommerceApplication {
    public static void main(String[] args) {
        Ajio.platformDetails();
        System.out.println();
        Ajio.termsAndConditions();
        System.out.println();
        Ajio.deliveryOptions();
        System.out.println();
        
        Ajio a1=new Ajio();
        a1.addProduct("Sports T-Shirt","Running Shoes","Sports pant");
        System.out.println();
        a1.viewCart();
        System.out.println();
        a1.placeOrder("Road No.2,KPHB Colony,Hyderabad");
        System.out.println();
        a1.trackOrder();
    }
}
