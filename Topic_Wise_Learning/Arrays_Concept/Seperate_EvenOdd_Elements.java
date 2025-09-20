package Arrays_Concept;

public class Seperate_EvenOdd_Elements {

	public static void main(String[] args) {
		
		int arr[] = {23,3,2,5,36,5,4,66,88,99,52};
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		int even[] = new int[evenCount];
		int odd[] = new int[oddCount];
		int evenC = 0;
		int oddC = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even[evenC++] = arr[i];
			}
			else {
				odd[oddC++] = arr[i];
			}
		}
		
		System.out.println("Even Array: ");
		for(int i = 0;i<even.length;i++) {
			System.out.print(even[i]+" ");
		}
		System.out.println("\nOdd Array: ");
		for(int i = 0;i<odd.length;i++) {
			System.out.print(odd[i]+" ");
		}
		

	}

}
