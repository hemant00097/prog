
public class Mobile {
	
	String Brand;
	String color;
	int price;
	Mobile(String b,String c ,int p)
	{
		this.Brand=b;
		this.color=c;
		this.price=p;
	}
	public static void main(String[] args) 
	{
		
		Mobile m1=new Mobile("Apple","silver",100000);
		Mobile m2=new Mobile("one plesh","blue",350000);
		System.out.println(m1.Brand +" "+m1.color+" "+m1.price );
		System.out.println(m2.Brand +" "+m2.color +" "+m2.price);
		
	}
}
