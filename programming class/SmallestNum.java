import java.util.Scanner;
public class SmallestNum {
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the Three Amount value");
       int x = sc.nextInt();
       int y= sc.nextInt();
       int z= sc.nextInt();
       sc.close();
       int smalle =x;
       if(y<smalle)
        smalle=y;
        if(z<smalle)
        smalle=z;
        System.out.println("Smallest value "+smalle);
    }
}
