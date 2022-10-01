import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number ");
        double r=sc.nextDouble();
        sc.close();
        double Radius=3.141*r*r;
        double Circum=2*3.141*r;
        System.out.println("Area: "+Radius);
        System.out.println("Circumference: "+Circum);
        
    }
    
}
