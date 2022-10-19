
import java.util.Scanner;
public class Q50 {
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Base ");
        int b = sc.nextInt();
        System.out.println("Enter The Height ");
        int h = sc.nextInt();
        sc.close();
        if (b <= 0 || h <= 0)
        System.out.println("Error");
    else 
        System.out.println("Area: " + (b * h));
    }
 }
 
