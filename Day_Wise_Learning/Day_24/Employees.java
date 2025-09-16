class Employee {
    int emp_id;
    String emp_name;
    int salary;
    
    //No Parameterized 
    Employee() {
        emp_id=0;
        emp_name=null;
        salary=15000;
    }
    Employee(int id) {
        emp_id=id;
        salary=15000;
    }
    Employee(int id,int sal) {
        emp_id=id;
        salary=sal;
    }
    Employee(int id,String name) {
        emp_id=id;
        emp_name=name;
        salary=15000;
    }
    Employee(int id,String name,int sal) {
        emp_id=id;
        emp_name=name;
        salary=sal;
    }
    public String toString() {
        return "Employee Name: "+emp_name+" | "+"Employee Id: "+emp_id+" | "+"Salary: "+salary;
    }
}
public class Employees {
    public static void main(String[] args) {
        Employee e1=new Employee(56325,"Suresh",25000);
        System.out.println(e1);
        System.out.println();
        Employee e2=new Employee(56326,"Kishore",25000);
        System.out.println(e2);
        System.out.println();
        Employee e3=new Employee(56327,"Manoj",25000);
        System.out.println(e3);
        System.out.println();
    }
}
