package Two_Dimesional_Arrays_Operations;

public class Average_marks_for_students {

	static int[][] students = { { 1, 2, 3 }, { 2, 3, 2 }, { 4, 3, 2 } };

	public static void averageMarks() {

		// loop for fetch students
		for (int st = 0; st < students.length; st++) {

			int avg = 0;
			int sum = 0;
			// loop for fetch all student marks
			for (int m = 0; m < students[st].length; m++) {
				sum += students[st][m];
				m++;
			}
			avg = sum / students[st].length;
			System.out.println(st + " student average Marks: " + avg);
		}
	}

	public static void main(String[] args) {
		averageMarks();
	}

}
