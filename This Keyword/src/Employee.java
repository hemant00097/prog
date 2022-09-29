
public class Employee {
String name;
int Sal;

Employee(String n,int s)
{
	this.name=n;
	this.Sal=s;
}
public static void main(String[] args) {
	Employee e1=new Employee("hemant",29999);
	Employee e2= new Employee("sandeep" ,32550);
	System.out.println(e1.name);
	System.out.println(e1.Sal);
	System.out.println(e2.name);
	System.out.println(e2.Sal);
}
}
