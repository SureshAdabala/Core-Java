class HospitalManagement {
    static String Hospitalname="Rainbow Children's Hospital";
    static String address="Vijayawada";
    static String visitingTime="10:00am to 12:00pm and 3:00pm to 5:00pm";
    static String contact="7997079970";
    
    String patientName;
    String doctorAssign,wardName;
    int billAmount;
    
    static void hospitalDetails() {
        System.out.println("-----Hospital Details-----");
        System.out.println(Hospitalname+" is located in "+address);
    }
    static void visitingHours() {
        System.out.println("-----Patient Visiting Hours-----");
        System.out.println("Morning and Afternoon(OPD is Mandatatory):  ");
        System.out.println(visitingTime);  
    }
    static void emergencyContact() {
        System.out.println("-----Emergency Details------");
        System.out.println("Pediatric Emergency number : "+contact);
    }
    void addPatient(String name1) {
        patientName=name1;
        System.out.println(patientName+" is added into Hospital Records");
    }
    void assignDoctor(String name2,String ward) {
        doctorAssign=name2;
        wardName=ward;
        System.out.println(doctorAssign+" is assigned to "+wardName+" Section");
    }
    void checkBill(int amount) {
        billAmount=amount;
        System.out.println(patientName+" total bill is Rs."+billAmount+" Everything is done.");
    }
    void dischargePatient() {
        System.out.println(patientName+" is Discharged.Because Health is in good Condition and Payment has been Done");
    }
}
public class HospitalManagementApplication {
    public static void main(String[] args) {
        HospitalManagement.hospitalDetails();
        System.out.println();  
        HospitalManagement.visitingHours();
        System.out.println(); 
        HospitalManagement.emergencyContact();
        
        HospitalManagement h1=new HospitalManagement();
        h1.addPatient("Baby");
        System.out.println();
        h1.assignDoctor("Dr.Vikram","pediatric");
        System.out.println();
        h1.checkBill(9999);
        System.out.println();
        h1.dischargePatient();
    }
}
