package Arrays_Concept;

public class Finding_Missing_Num_In_Range {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 4, 5, 6, 7 };
		int n = arr.length + 1;

		int ExpectedSum = n * (n + 1) / 2;
		int ActualSum = 0;

		for (int i = 0; i < arr.length; i++) {
			ActualSum += arr[i];
		}

		int MissingChar = ExpectedSum - ActualSum;
		System.out.print("Missing Character is: " + MissingChar);
	}
	
}
