package Arrays_Concept;

import java.util.Arrays;

public class Sort_an_Array {

	public static void main(String[] args) {
		int arr[] = { 9, 5, 6, 4, 2, 3, 5, 86, };

		for (int i = 0; i < arr.length - 1; i++) {
			
			for (int j = 0; j < arr.length - 1 - i; j++) {
				
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorting array is: \n"+Arrays.toString(arr));
	}

}
