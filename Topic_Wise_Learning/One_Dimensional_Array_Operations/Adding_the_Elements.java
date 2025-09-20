package One_Dimensional_Array_Operations;

import java.util.Arrays;

public class Adding_the_Elements {
	static int arr[] = new int[5];
	static int index = 0;
	
	public static void add(int ele) {
		
		if(index>=arr.length) {
			System.out.println(ele+" Cannot be Added : Index Out of Bound");
			return;
		}
		arr[index] = ele;
		index++;
	}
	public static void print() {
		System.out.println("Array is: "+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		add(10);
		add(20);
		add(30);
		add(40);
		add(50);
		print();
		
		add(60);
		print();
		
	}
	 

}

