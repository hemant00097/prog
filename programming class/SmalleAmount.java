import java.util.Scanner;

public class SmalleAmount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number ");
        double a=sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        if(a<=b)
        System.out.println(a + " is  Smallest Amount ");
        else
        System.out.println(b + " is  Smallest Amount ");

    }
}