package Arrays_Concept;

import java.util.Arrays;

public class Copying_the_Array {

	public static void main(String[] args) {
		int arr1[] = {10,23,1,2,56,2,4,4};
		int arr2[] = new int[arr1.length];
		
		System.out.println("Before copying: ");
		System.out.println(Arrays.toString(arr2));
		
		for(int i = 0;i<arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("After copying: ");
		System.out.println(Arrays.toString(arr2));
	}
}
