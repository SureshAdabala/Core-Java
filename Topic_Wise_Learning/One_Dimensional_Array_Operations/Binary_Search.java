package One_Dimensional_Array_Operations;

public class Binary_Search {
	
	static int[] arr = {1,2,3,4,5,6,7,8,9};
	
	public static void BinarySearch(int num) {
		
		int position = -1;
		int start = 0;
		int end = arr.length-1;
		
		
		while(start <= end) {
			int mid = (start+end)/2;
			if(num == arr[mid]) {
				position = mid;
				break;
			}
			else if(num > arr[mid]) {
				start=mid+1;
			}
			else {
				end = mid - 1;
			}
		}
		
		System.out.println(num+" is found at "+position+" index");
		
	}
	public static void main(String[] args) {
		BinarySearch(9);
	}

}
