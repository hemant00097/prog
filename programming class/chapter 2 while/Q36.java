import java.util.Scanner;

public class Q36 {

    private static int gcd(int a, int b) {
        int x;

        if(a < b)
            x=a;
        else
            x=b;

        while(x>=1) {
            if(a%x==0 && b%x==0) 
                break;
            x--;
        }
        return x;
    }
       

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(" GCD is: "+gcd(a, b));
    }
}
