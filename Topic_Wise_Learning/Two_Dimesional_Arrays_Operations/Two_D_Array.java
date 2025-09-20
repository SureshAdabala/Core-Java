package Two_Dimesional_Arrays_Operations;

public class Two_D_Array {

	static int[][] students = { { 1, 2, 3 }, { 2, 3, 2 }, { 4, 3, 2 } };

	public static void printStudentMarks() {

		// loop for Fetch all Students
		for (int student = 0; student < students.length; student++) {

			System.out.println(student + " Student Details:");

			// loop for fetch all student marks
			for (int marks = 0; marks < students[student].length; marks++) {
				System.out.print(students[student][marks]+" ");
			}
			System.out.println();
			System.out.println("============================");
		}
	}

	public static void main(String[] args) {
		
		printStudentMarks();

	}

}
