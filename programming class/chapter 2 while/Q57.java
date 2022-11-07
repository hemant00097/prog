import javax.xml.transform.Source;

public class Q57 {
    public static void main(String[] args) {
        int inA=10, inB=10;
        int decA=10, decB=10;
        //Working of perincrement & postincrement
        System.out.print("a= "+inA);
        System.out.print("\t\t a++= "+inA);
        System.out.print("\n b= "+inB);
        System.out.print("\t\t ++b= "+ ++inB);

         //Working of predecrement & postincrement
         System.out.print("\n\na= "+decA);
         System.out.print("\t\t a++= "+decA--);
         System.out.print("\n b= "+decB);
         System.out.print("\t\t --b= "+ --decB);
    }
}
