class College {
    static String name="Eswar College of Engineering";
    static String address="Kesanupalli";
    
    String studentName;
    int studentRank;
    static void collegeDetails() {
        System.out.println("--College Details");
        System.out.println(name+" is located in "+address);
    }
    static void collegeRules() {
        System.out.println("--College Rules--");
        System.out.println("1. Intermediate must be in 80-90%");
        System.out.println("2. Qualified in Eamcet");
        System.out.println("3. Eligibility for counselling");
    }
    void joinNewStudent(String name) {
        studentName=name;
        System.out.println(studentName+" added into college records");
    }
    void eamcetRank(int rank) {
        studentRank=rank;
        System.out.println(studentName+" is got "+studentRank+"th rank in state");
    }
}

public class CollegeApplication {
    public static void main(String[] args) {
        College.collegeDetails();
        System.out.println();
        College.collegeRules();
        System.out.println();
        
        College s2=new College();
        s2.joinNewStudent("Suresh");
        System.out.println();
        s2.eamcetRank(112758);
        System.out.println();
    }
}
