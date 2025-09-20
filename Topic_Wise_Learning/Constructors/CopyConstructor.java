package Constructors;

class Student {

	String Student_name;
	int marks;
	String course;
	int age;
	char Gender;

	Student() {
		Student_name = null;
		marks = 0;
		course = null;
		age = 0;
		Gender = 0;
	}

	// this --> This is a keyword which is used to differentiate global variables
	// and local variables
	// Whenever we are having global variables and local variables with same name,
	// we use
	// this keyword in front of global variables
	Student(String Student_name, int marks, String course, int age, char Gender) {
		this.Student_name = Student_name;
		this.marks = marks;
		this.course = course;
		this.age = age;
		this.Gender = Gender;
	}

	Student(Student obj) {
		Student_name = obj.Student_name;
		marks = obj.marks;
		course = obj.course;
		age = obj.age;
		Gender = obj.Gender;
	}

	public String toString() {
		return "Name: " + Student_name + " | " + "Marks: " + marks + " | " +
	           "Course: " + course + " | " + "Age: " + age+ " | " + "Gender: " + Gender;
	}
} 

public class CopyConstructor {

	public static void main(String[] args) {
		Student s1 = new Student("Suresh", 499, "Java Full Stack", 22, 'M');
		System.out.println(s1);

		System.out.println("===========================================");

		// Copy Constructor
		Student s2 = new Student(s1);
		System.out.println(s2);
	}
}
