package Basic_Array_Programs;

public class Length_of_Elements {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 34, 5, 6, 7, 8 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
		}
		System.out.println("Length of the Elements is: " + count);
	}

}
