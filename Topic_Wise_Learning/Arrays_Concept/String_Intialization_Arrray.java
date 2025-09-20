package Arrays_Concept;

public class String_Intialization_Arrray {

	public static void main(String[] args) {

		//Declation and memory allocation
		String arr[] = new String[4];
		arr[0] = "Veerraju";
		arr[1] = "Lakshmi";
		arr[2] = "Suresh";
		arr[3] = "Venkatesh";

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println("============================");

		for (int i = 0; i < 4; i++) {
			System.out.println(arr[i]);
		}
	}
}
