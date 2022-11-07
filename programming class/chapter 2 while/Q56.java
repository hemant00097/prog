import java.util.Scanner;
public class Q56
 {
    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
             return false;
        }
        return true;
    }

    static int sumOfdigit(int s, int e) {
        int sum = 0;
        {
            for (int i =s ; i <= e; i++)
            if(isPrime(i))
                sum = sum + i;

        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(sumOfdigit(s,e));
        sc.close();
    }

}