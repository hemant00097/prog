package constructer;

public class Student {
	Student()
	{
    	System.out.println("E-start");
    	System.out.println("Student");
    	System.out.println("E-end");
    }
	public static void main(String[] args) {
		System.out.println("M1-Start");
		Student s1=new Student();
		System.out.println("M1-End");
		System.out.println("M2-Start");
		Student s2=new Student();
		System.out.println("M2-End");
		
	}
}
