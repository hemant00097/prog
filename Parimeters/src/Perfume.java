
public class Perfume {
	String brand;
	int price;
	Perfume(String b,int p)
	{
		this.brand=b;
		this.price=p;
		
	}
	public static void main(String[] args) {
		Perfume p1=new Perfume("X",100);
		Perfume p2=new Perfume("Y",200);
		System.out.println("Brand " +p1.brand);
		System.out.println("price " +p1.price);
		System.out.println("Brand " +p2.brand);
		System.out.println("price " +p2.price);
		
		
		
	}

}
