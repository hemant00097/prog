
public class Watch1 {
	String brand;
	int price;
	Watch1()
	{
      this.brand="Amaza-fit";
      this.price=12000;
	}
	public static void main(String[] args) {
		Watch1 w1=new Watch1();
		System.out.println(w1.brand);
		System.out.println(w1.price);
		Watch1 w2=new Watch1();
		System.out.println(w2.brand);
		System.out.println(w2.price);
		
	}


}
