package One_Dimensional_Array_Operations;

import java.util.Arrays;

public class StudentManagaement {

	public static int[] students = new int[5];
	public static  int count = 0;
	
	public static void add(int rollNumber) {
       if(count < students.length) {
			students[count] = rollNumber;
			count++;
			System.out.println("Added Roll Number: "+rollNumber);
		}
		else {
			System.out.println("Array is Full");
		}
	}
	public static void display() {
		
		System.out.println("Final Array is: "+Arrays.toString(students));
	}
	
	public static void main(String[] args) {
		
		add(12);
		add(25);
		add(54);
		add(65);
		add(55);
		display();
		
		add(67);
		display();
		
	}
}
