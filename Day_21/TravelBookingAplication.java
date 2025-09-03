//Travel Booking Appplication
class TravelBooking {
    //Default Booking
    void bookTicket(String source,String destination) {
        System.out.println("-----Journey Details-----");
        System.out.println("Source: "+source);
        System.out.println("Destination: "+destination);
    }
    //With date
    void bookTicket(String source,String destination,String date) {
        System.out.println("-----Journey Details-----");
        System.out.println("Source: "+source);
        System.out.println("Destination: "+destination);
        System.out.println("Date of Journey: "+date);
    }
    //Group Booking 
    void bookTicket(String source,String destination,int totalPassengers) {
        System.out.println("-----Journey Details-----");
        System.out.println("Source: "+source);
        System.out.println("Destination: "+destination);
        System.out.println("Number of Passengers: "+totalPassengers);
    }
    //With Seat Preference 
    void bookTicket(String source,String destination,String date,String seatType) {
        System.out.println("-----Journey Details-----");
        System.out.println("Source: "+source);
        System.out.println("Destination: "+destination);
        System.out.println("Date of Journey: "+date);
        System.out.println("Seat Preference: "+seatType);
    }
}
public class TravelBookingAplication {
    public static void main(String[] args) {
        TravelBooking travel=new TravelBooking();
        travel.bookTicket("Hyderabad","Nidadavole");
        System.out.println();
        travel.bookTicket("Narasaropet","Tanuku","23/01/2025");
        System.out.println();
        travel.bookTicket("Vijayawada","Kanuru",15);
        System.out.println();
        travel.bookTicket("KPHB","Secunderbad","20/11/2025","Window");
    }
}
