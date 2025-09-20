package Arrays_Concept;

public class Remove_Duplicate_Elements {

	public static void main(String[] args) {
		int arr[] = { 25, 3, 2, 6, 53, 2, 3, 25, 53, 55, 3, 55, };

		System.out.println("Array Without Duplicates: ");

		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
