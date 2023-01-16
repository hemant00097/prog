public class Tv extends Ligth
 {
    @Override
    void switchOn()
    {
       System.out.println("Tv on");
    }
    @Override
    void switchOff()
    {
        System.out.println("Tv off");
    }
    public static void main(String[] args) 
    {
        Tv t1=new Tv();
        t1.switchOn();
        t1.switchOff();
    }
}
