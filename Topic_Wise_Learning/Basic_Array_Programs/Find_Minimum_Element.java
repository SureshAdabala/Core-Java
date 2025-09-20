package Basic_Array_Programs;

public class Find_Minimum_Element {

	public static void main(String[] args) {
		
		int arr[] = {2,3,2,6,3,4,5,3,6,43,5};
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum Element is: "+min);

	}

}
