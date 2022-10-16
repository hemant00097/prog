import java.util.Scanner;

public class DesimalToBinery {
    static String dectobinery(int dec)
    {
        String bin=" ";
      do{
        int b=dec%2;
        bin=b+bin;
        dec=dec/2;
      }while(dec!=0);
      return bin;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        sc.close();
    
        System.out.println(dectobinery(n));
    }
}
