public class Fan extends Ligth 
{
    
    @Override
    void switchOn()
    {
       System.out.println("Fan on");
    }
    @Override
    void switchOff()
    {
        System.out.println("Fan off");
    }
    public static void main(String[] args) 
    {
        Fan F1=new Fan();
        F1.switchOn();
        F1.switchOff();
    }
}
