package Arrays_Concept;


public class Second_Maximum_number_in_Array {

	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,4,8,};
		int first_max = 0;
		int second_max = 0;
		int third_max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first_max) {
				third_max = second_max;
				second_max = first_max;
				first_max = arr[i];
			}
			if (arr[i] > second_max && arr[i] != first_max) {
				second_max = arr[i];
			}
			if (arr[i] > third_max && arr[i] != first_max && arr[i] != second_max) {
				third_max = arr[i];
			}
		}
		System.out.println("First Maximum Number is: " + first_max);
		System.out.println("Second Maximum Number is: " + second_max);
		System.out.println("Third Maximum Number is: " + third_max);
	}
}
