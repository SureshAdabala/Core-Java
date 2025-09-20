package Arrays_Concept;

public class Count_Duplicate_Elements {

	public static void main(String[] args) {
		int arr[] = { 2, 23, 53, 6, 6, 5, 23, 25, 4, 56, 53, 2, 6 };
		boolean visited[] = new boolean[arr.length];
		int duplicateCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (visited[i]) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					visited[i] = true;
					count++;
				}
			}
			if(count>1)
			{
				duplicateCount++;
				System.out.println(arr[i]+" is duplicated in "+count+" times");
			}
		}
		System.out.println("Total Number of Duplicants is: "+duplicateCount);

	}

}
