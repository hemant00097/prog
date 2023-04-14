public class Moverloading {
    //payment via Cash
    void Pay()
    {
        System.out.println("Cash");
    }
    // payment via netbanking
    void Pay(int id,String pad)
    {
        System.out.println("net Bnaking");
    }
    // payment via UPI
    void Pay(String upiID,int pin)
    {
        System.out.println("UPI");
    }
    //payment via card 
    void Pay(String name,long no,int cvv,String exp)
    {
        System.out.println("card");
    }
    public static void main(String[] args) {
        Moverloading m=new Moverloading();
        m.Pay();
        m.Pay(321564, "java@123");
        m.Pay("986598322@you", 1234);
        m.Pay("Hemant", 1234589896, 123, "12/15");
    }
}
