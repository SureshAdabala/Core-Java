package Basic_Array_Programs;

public class Find_Maximum_Element {

	public static void main(String[] args) {

		int arr[] = { 25, 3, 23, 6, 3, 3, 35, 4, 5, 3, 6, 56 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum number is: " + max);

	}

}
