package Two_Dimesional_Arrays_Operations;

public class Find_highest_last_digit {

	static int[][] students = { { 3, 2, 3 }, { 1, 3, 2 }, { 3, 3, 2 }, { 1, 2, 6 } };

	public static void HigestThirdDigit() {
		int max = 0;
		// loop for ftech all students
		for (int st = 0; st < students.length; st++) {

//			//loop for fetch all student marks
//			for(int m=0;m<students[st].length;m++) {
//				if(m==students[st].length-1) {
//					if(students[st][m] > max) {
//						max = students[st][m];
//					}
//				}
//			}
			int lastdigit = students[st][students[st].length - 1];
			if (lastdigit > max) {
				max = lastdigit;
			}
		}
		System.out.println("Highest third digit is " + max);

	}

	public static void main(String[] args) {

		HigestThirdDigit();
	}

}
