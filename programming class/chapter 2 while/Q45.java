
import java.util.Scanner;

public class Q45 {
  static int pow(int n, int p) {
        int pw=1;
        while(p>0) {
            pw= pw*n;
            p--;
        }
        return pw;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(pow(n, p));
        sc.close();
    }
}