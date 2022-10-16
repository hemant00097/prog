
import java.util.Scanner;

public class DecimalToOcta {
    static String dectoOcta(int dec)
    {
        String octa=" ";
      do{
        int b=dec%8;
        octa=b+octa;
        dec=dec/8;
      }while(dec!=0);
      return octa;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        sc.close();
    
        System.out.println(dectoOcta(n));
    }
}

