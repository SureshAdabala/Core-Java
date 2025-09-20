package One_Dimensional_Array_Operations;

import java.util.Arrays;

public class RotatingLeft_the_Elements {

	static int arr[] = { 1, 2, 3, 4, 5, 6 };

	public static void rotate(int k) {

		int temp[] = new int[k];

		// add k values into temp array
		for (int i = 0; i < k; i++) {
			temp[i] = arr[i];
		}

		// shift the position based on the k values
		for (int i = k; i < arr.length; i++) {
			arr[i - k] = arr[i];
		}

		// add the temp values into original array
		for (int i = 0; i < temp.length; i++) {
			arr[arr.length + i - k] = temp[i];
		}
		System.out.println("Final Array is: " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		rotate(2);
	}
}
