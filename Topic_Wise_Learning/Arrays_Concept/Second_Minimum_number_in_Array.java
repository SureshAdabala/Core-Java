package Arrays_Concept;

public class Second_Minimum_number_in_Array {

	public static void main(String[] args) {
		int arr[] = {1,3,4,5,6,7,8,97,9,65};
		int First_Min = Integer.MAX_VALUE;
		int Second_Min = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(First_Min > arr[i]) {
				Second_Min = First_Min;
				First_Min = arr[i];
			}
			if(Second_Min > arr[i] && arr[i] != First_Min) {
				Second_Min = arr[i];
			}
		}
		System.out.println("First Minimum Number is: "+First_Min);
		System.out.println("Second Minimum Number is: "+Second_Min);
	}

}
