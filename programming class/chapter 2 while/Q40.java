
import java.util.Scanner;

public class Q40 {
    private static void table(int n) {
        for(int i=1; i<=10; i++) {
            int b=n*i;
            System.out.println(n +" * " +i+ " = " + b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        table(n);
    }
}