package Arrays_Concept;

public class Finding_Average_of_Elements {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 6, 5, 2, 3, 5, 6, 3, };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		double average = (double) sum / arr.length;
		System.out.println("Average of Elements: " + average);

	}
}
