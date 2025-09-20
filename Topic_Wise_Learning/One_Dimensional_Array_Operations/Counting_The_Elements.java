package One_Dimensional_Array_Operations;

public class Counting_The_Elements {

	public static void count(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				count++;
			}
		}
		System.out.println("Number of elements in an Array: " + count);
	}

	public static void main(String[] args) {

		int arr[] = new int[5];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		count(arr);

		arr[4] = 3;
		count(arr);

		arr[2] = 0;
		count(arr);

	}

}
