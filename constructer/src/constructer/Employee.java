package constructer;

public class Employee {
    Employee()
    {
    	System.out.println("E-start");
    	System.out.println("Employee");
    	System.out.println("E-end");
    }
    public static void main(String[] args) {
		System.out.println("Start");
		Employee e1=new Employee();
		Employee e2=new Employee();
		System.out.println("End");
		
	}
}
