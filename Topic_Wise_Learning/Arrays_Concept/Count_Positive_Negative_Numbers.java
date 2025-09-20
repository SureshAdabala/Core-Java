package Arrays_Concept;

public class Count_Positive_Negative_Numbers {

	public static void main(String[] args) {
		int arr[] = {1,2,-3,-56,78,-56,63,-63,-53};
		int positive = 0;
		int negative = 0;
		 for(int i = 0;i<arr.length;i++) {
			 if(arr[i]>0) positive++;
			 if(arr[i]<0) negative++;
		 }
		 System.out.println("Positive numbers in an Array: "+positive);
		 System.out.println("Negative numbers in an Array: "+negative);

	}
}
