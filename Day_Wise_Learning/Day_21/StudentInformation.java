//Student Information
class StudentInfo {
    void registerStudent(String name,int age) {
        System.out.println("-----Student Information-----");
        System.out.println("Student Name: "+name);
        System.out.println("Student age: "+age);
    }
    void registerStudent(String name,int age,String course) {
        System.out.println("-----Student Information-----");
        System.out.println("Student Name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Course Name: "+course);
    }
    void registerStudent(String name,int age,String course,String email) {
        System.out.println("-----Student Information-----");
        System.out.println("Student Name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Course Name: "+course);
        System.out.println("Email ID: "+email);
    }
}
public class StudentInformation {
    public static void main(String[] args) {
        StudentInfo student=new StudentInfo();
        student.registerStudent("Suresh",21);
        System.out.println();
        student.registerStudent("Kishore",20,"Java Full Stack");
        System.out.println();
        student.registerStudent("Manoj",22,"Java Full Stack","gmanoj123@gmail.com");
    }
}
