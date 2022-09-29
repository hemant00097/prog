import java.util.Scanner;

public class SmallestAmount {
    public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Two Amount value");
        int x = sc.nextInt();
        int y= sc.nextInt();
        sc.close();
         int smalle =x;
         if(smalle>y)
          smalle=y;
         System.out.println(smalle+" is samallest ");

    }
}
