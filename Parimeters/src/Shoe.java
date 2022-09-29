
public class Shoe {
	String name;
	int price;
	String color;
	Shoe(String n,int p,String c)
	{
		this.name=n;
		this.price=p;
		this.color=c;
	}
	public static void main(String[] args) {
		Shoe s1=new Shoe("H2X",2000,"Red");
		Shoe s2=new Shoe("12aw",5000,"Black");
		System.out.println("Name " +s1.name);
		System.out.println("Price " +s1.price);
		System.out.println("Color " + s1.color);
		System.out.println("Name " +s2.name);
		System.out.println("Price " +s2.price);
		System.out.println("Color " + s2.color);
	}

}
