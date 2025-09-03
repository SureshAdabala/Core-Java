class SchoolManagement {
    static String name="Z.P.High School";
    static String address="Kanuru";
    
    String teacherName;
    String studentName;
    String className;
    String Class1;
    char studentResult;
    static void schoolDetails() {
        System.out.println("----School Details----");
        System.out.println(name+" is located in"+address);
    }
    static void schoolRules() {
        System.out.println("----Rules----");
        System.out.println("1. Uniform is Mandatory");
        System.out.println("2. Only speak in english to others");
        System.out.println("3. Shoes and ID card is Compulsory");
        System.out.println("4. Attendance is minimum 75% after completion of class");
    }
    void addTeacher(String name1) {
        teacherName=name1;
        System.out.println(teacherName+" Madam is added into school records");
    }
    void addStudent(String name1) {
        studentName=name1;
        System.out.println(studentName+" is added");
    }
    void assignClass(String name2) {
        className=name2;
        System.out.println(teacherName+" is assigned by "+name2+" class" );
    }
    void getResult(char grade) {
        studentResult=grade;
        System.out.println(studentName+" is got "+grade);
    }
}
public class SchoolApplication {
    public static void main(String[] args) {
        SchoolManagement.schoolDetails();
        System.out.println();
        SchoolManagement.schoolRules();
        System.out.println();
        
        SchoolManagement m1=new SchoolManagement();
        
        m1.addTeacher("Maheswari");
        System.out.println();
        m1.addStudent("Suresh");
        System.out.println();
        m1.assignClass("10th");
        System.out.println();
        m1.getResult('B');
    }
}
