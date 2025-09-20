package Arrays_Concept;

import java.util.Arrays;
public class CopyingArray_In_ReverseOrder {

	public static void main(String[] args) {
		int arr1[] = {10,23,1,2,56,2,4,4};
		int arr2[] = new int[arr1.length];
		int len = arr1.length;
		
		System.out.println("Before Copying in Reverse Order: ");
		System.out.println(Arrays.toString(arr2));
		
		for(int i = 0;i<arr1.length;i++) {
			arr2[len-1-i] = arr1[i];	
		}
		
		System.out.println("After Copying in Reverse Order: ");
		System.out.println(Arrays.toString(arr2));
	}

}
