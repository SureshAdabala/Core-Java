package One_Dimensional_Array_Operations;

public class Searching_Student_Name {
	
	String student_names[] = {"Naveen", "Raju", "Pavan", "Charan", "Rahul", "Raju"};
	
	public void search(String name) {
		int count = 0;
		for(int i = 0;i<student_names.length;i++) {
			if(student_names[i].equals(name)) {
				count++;
				if(count == 1) {
					System.out.println(count+"st Student found at "+i);
			    }
				else if(count == 2) {
					System.out.println("Also Student found at "+i);
				}
				else if(count == 3) {
					System.out.println("Also Student found at "+i);
				}
				else {
					System.out.println(count+"th student found at "+i);
				}	
		   }
		}
		if(count == 0) {
			System.out.println(name+" not Found");
		}
	}
	public static void main(String[] args) {
		
		Searching_Student_Name SN = new Searching_Student_Name();
		
		SN.search("Suresh");
		SN.search("Kishore");
		SN.search("Raju");
	}
}

