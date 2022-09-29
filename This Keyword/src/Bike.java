
public class Bike {

	String Name;
	Bike(String n)
	{
		this.Name=n;
	}
	public static void main(String[] args) {
		Bike b1=new Bike("ninja");
		Bike b2=new Bike("bmw");
		System.out.println(b1.Name);
		System.out.println(b2.Name);
	}
}
