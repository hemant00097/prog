public class Tomato1 extends VegeTable1 {
   void prepareketchup()
    {
      System.out.println("ketchup");
    }
    public static void main(String[] args) {
        Tomato1 t1=new Tomato1();
        t1.price=20;
        t1.washVegetable();
        t1.prepareketchup();
    }
}
