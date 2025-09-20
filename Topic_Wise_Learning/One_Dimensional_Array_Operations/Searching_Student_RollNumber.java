package One_Dimensional_Array_Operations;

public class Searching_Student_RollNumber {
	
	int[] students = {5,8,3,6,8,9};
	
	public void search(int rollNumber) {
		boolean founded = false;
		for(int i = 0;i<students.length;i++) {
			if(students[i] == rollNumber) {
				System.out.println(students[i]+"th Roll Number Student Found at Index "+i);
				founded = true;
				break;
			}
		}
		if(!founded) {
			System.out.println("Student Not Found");
		}
	}

	public static void main(String[] args) {
		
		Searching_Student_RollNumber SR = new Searching_Student_RollNumber();
		
		SR.search(8);
		SR.search(55);

	}

}
