public class Carrot1 extends VegeTable1 {
    void prepareHalwa()
    {
      System.out.println("Halwa ");
    }
    public static void main(String[] args) {
        Carrot1 c1=new Carrot1();
        c1.price=60;
        c1.washVegetable();
        c1.cutVegetable();
        c1.prepareHalwa();
    }
}
