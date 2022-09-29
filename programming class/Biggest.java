import java.util.Scanner;
public class Biggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Three Double Number");
        double x= sc.nextDouble();
        double y= sc.nextDouble();
        double z= sc.nextDouble();
        sc.close();
        double big =x ;
        if(y>big)
         big =y;
        
         if(z>big)
         big =z;
         System.out.println(" Biggest value "+big);
    }
}
