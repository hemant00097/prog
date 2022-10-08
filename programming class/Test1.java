
import java.util.Scanner;

public class Test1 {
    static int prodOfDigit(int n) {
        int prod = 1;
        while (n != 0) {
            int r = n % 10;
            prod = prod * r;
            n = n / 10;   
        }
        return prod;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int x = sc.nextInt();

        int prod = prodOfDigit(x);
        System.out.println("prod of Digit:" + prod);
    }
}