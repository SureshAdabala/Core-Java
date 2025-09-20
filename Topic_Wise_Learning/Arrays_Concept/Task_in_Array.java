package Arrays_Concept;

public class Task_in_Array {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		int sumE = 0;
		int sumO = 0;
		int sumEI = 0;

		// Print all Elements
		System.out.println("All Elements in an Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("--------------------------------");

		// Print sum of all Elements
		System.out.println("Sum of all Elements in an Array: ");
		for (int j = 0; j < arr.length; j++) {
			sum += arr[j];
		}
		System.out.println(sum);
		System.out.println("--------------------------------");

		// Print sum of all Even Numbers
		System.out.println("Sum of all Even Numbers in an Array: ");
		for (int s = 0; s < arr.length; s++) {
			if (arr[s] % 2 == 0)
				sumE += arr[s];
		}
		System.out.println(sumE);
		System.out.println("--------------------------------");

		// Print sum of all Even Numbers
		System.out.println("Sum of all Odd Numbers in an Array: ");
		for (int p = 0; p < arr.length; p++) {
			if (arr[p] % 2 != 0)
				sumO += arr[p];
		}
		System.out.println(sumO);
		System.out.println("--------------------------------");

		// Print sum of all even indexing Elements
		System.out.println("Sum of all Even Indexing Elemenst in an Array: ");
		for (int v = 0; v < arr.length; v++) {
			if (v % 2 == 0)
				sumEI += arr[v];
		}
		System.out.println(sumEI);
		
	}

}
