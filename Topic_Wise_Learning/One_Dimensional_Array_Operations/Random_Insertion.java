package One_Dimensional_Array_Operations;

public class Random_Insertion {
	
	public int[] students = new int[5];
	
	public void add(int index, int student_id) {
		if(index < 0 || index > students.length) {
			System.out.println("Invalid Index Number");
			return;
		}
		
		if(students[index] == 0) {
			students[index] = student_id;
			System.out.println("Insert "+student_id+" at index of "+index);
		}
		else {
			System.out.println(index+"th is already occupied");
			
			//If index number is already occupied and search for unoccupied index
			boolean inserted = false;
			for(int i = 0;i<students.length;i++) {
				if(students[i] == 0) {
					students[i] = student_id;
					System.out.println("So, Insert "+student_id+" at index of "+i);
					inserted = false;
					break;
				}
			}
			if(!inserted) {
				System.out.println("Array is Full");
			}
		}
		
	}
	
	public void display() {
		System.out.println("Final array elements is: ");
		for(int i = 0;i<students.length;i++) {
			System.out.print(students[i]+" ");
		}
		System.out.println();
	}

	public static void main (String[] args) {
		
		Random_Insertion R = new Random_Insertion();
		
		R.add(0,45);
		R.add(1, 65);
		R.add(2, 55);
		R.add(1, 67);
		R.display();
		
	}

}
