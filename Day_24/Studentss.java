class student {
    String student_name;
    int marks;
    String course;
    
    //no paramaterized
    student() {
        student_name=null;
        marks=0;
        course="Java Full Stack Devlopement";
    }
    
    //Single Parameterized Constructor
    //with name
    student(String name) {
        student_name=name;
        course="Java Full Stack Devlopement";
    }
    
    //2 Parameterized Constructor
    //with name and marks
    student(String name,int mark) {
        student_name=name;
        marks=mark;
        course="Java Full Stack Devlopement";
    }
    
    //with name and course
    student(String name,String Course_name) {
        student_name=name;
        course=Course_name;
    }
    
    //3 Parameterized Constructor
    //with all 
    student(String name,String Course_name,int mark) {
        student_name=name;
        course=Course_name;
        marks=mark;
    }

    public String toString() {
        return "Name: "+student_name+" | "+"Course Name: "+course+" | "+"Marks: "+marks;
    }
}
public class Studentss {
    public static void main(String[] args) {
        student s1 = new student("Suresh");
        System.out.println(s1);
    }
}
