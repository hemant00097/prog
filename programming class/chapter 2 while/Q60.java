import java.util.Scanner;

public class Q60 {
    static int fact(int n) {
        int fact = 1;
        while(n>1) {
            fact = fact * n;
            n--;
        }
        return fact;
    }

    static int ncr(int n, int r) {
        return fact(n) / (fact(n-r) * fact(r));
    }

    static int npr(int n, int r) {
        return fact(n)/fact(n-r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.close();

        System.out.println("NCR: "+ncr(n, r));
        System.out.println("NPR: "+npr(n, r));
    }
}
