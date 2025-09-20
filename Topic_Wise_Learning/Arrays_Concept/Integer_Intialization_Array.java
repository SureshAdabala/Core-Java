package Arrays_Concept;

public class Integer_Intialization_Array {

	public static void main(String[] args) {
		
		//Declaration
		//Datatype ref_variable[]
		
		int[] arr;
		
		//Memory allocation --> arr = new datatype[size];
		
		arr = new int[5];
		
		//assign --> indexes
		//Whole Numbers --> 0,1,........
		
		arr[0] = 10;
		arr[2] = 20;
		arr[3] = 30;
		arr[4] = 40;
		arr[1] = 50;
		
		//Accessing particular Elememts 
		
		System.out.println(arr[2]);
		System.out.println(arr[4]);
		System.out.println(arr[3]);
		
		System.out.println("=================");
		
		//Accessing all elements 
		
		for(int i=0;i<5;i++) {
		System.out.println(arr[i]);
	
		}
	}
}
