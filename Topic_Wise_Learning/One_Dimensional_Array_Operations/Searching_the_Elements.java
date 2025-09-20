package One_Dimensional_Array_Operations;

public class Searching_the_Elements {
	
	static int[] arr = new int[] {10,20,30,40};
	
	//By using Position Values
	public static void search(int position) {
		if(position>arr.length) {
			System.out.println("Out of Bound");
			return;
		}
		else {
		System.out.println(position+" position value is "+arr[position]);
		}
	}
	
	//By using Index Values or data
	public static void index(int num) {
		int position = -1;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==num) {
				position = i;
			}
		}
		if(position == -1) {
			System.out.println(num+" is not found");
		}
		else {
			System.out.println(num+" is found at "+position+" index");
		}
	}


	public static void main(String[] args) {
	
		search(5);
		search(3);
		System.out.println();
		index(arr[0]);
		index(arr[arr.length-1]);
		index(arr[(0+arr.length-1)/2]);
		
	}
	
}
