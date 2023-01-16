public class Bike extends Vehicte
{
    public static void main(String[] args) 
    {
        Bike b1=new Bike();
        b1.name="Duke";
        b1.price=2400000;
        System.out.println(b1.name);
        System.out.println(b1.price);
        b1.StartEngine();
        b1.StopEngine();
    } 
}
