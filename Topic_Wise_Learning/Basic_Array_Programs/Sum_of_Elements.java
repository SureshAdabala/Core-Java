package Basic_Array_Programs;

public class Sum_of_Elements {

	public static void main(String[] args) {

		int[] arr = { 20, 20, 30, 40 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of Elements: " + sum);
		System.out.println();
	}

}
