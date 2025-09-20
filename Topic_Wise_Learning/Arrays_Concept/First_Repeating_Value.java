package Arrays_Concept;

public class First_Repeating_Value {

	public static void main(String[] args) {
		
		int arr[] = {6,3,7,9,8,5,6,9,2,1};
		
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println("First Repeating Element: "+arr[i]);
					return;
				}
			}
		}
		System.out.println("No Repeating Element is found in an given array");
	}
}
