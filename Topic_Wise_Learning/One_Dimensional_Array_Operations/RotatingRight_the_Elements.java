package One_Dimensional_Array_Operations;

import java.util.Arrays;

public class RotatingRight_the_Elements {
	
	static int arr[] = {1,2,3,4,5,6};
	
	public static void rotate(int k) {
		
		int temp[] = new int[k];
		
		int n=arr.length;
		k = k % n;
		
		for(int i =0;i<k;i++) {
			temp[i] = arr[n-k+i];
		}
		
		for(int i=n-1;i>=k;i--) {
			arr[i] = arr[i-k];
		}
		
		for(int i=0;i<temp.length;i++) {
			arr[i] = temp[i];
		}
		System.out.println("Final Array is: "+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		
		rotate(2);

	}

}
