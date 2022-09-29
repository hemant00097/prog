
public class Student {
	String name;
	int age;
	double peresenteg;
	String qualification;
	Student(String n,int a,double p,String q)
	{
		this.name=n;
		this.age=a;
		this.peresenteg=p;
		this.qualification=q;
	}
	public static void main(String[] args) 
	{
		Student s1=new Student("Amit",24,80.5,"MBA");
		Student s2=new Student("Hemant",25,76.69,"MCA");
		System.out.println("Name " +s1.name);
		System.out.println("Age " +s1.age);
		System.out.println("Peresenteg " +s1.peresenteg);
		System.out.println("qualification " +s1.qualification);
		
		System.out.println("Name " +s2.name);
		System.out.println("Age " +s2.age);
		System.out.println("Peresenteg " +s2.peresenteg);
		System.out.println("qualification " +s2.qualification);
		
	}

}
