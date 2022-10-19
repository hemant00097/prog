
import java.util.Scanner;

public class Q42 {
    static String bineryary(int n) {
        String binery="";
        while(n!=0) {
            int b = n%2;
            binery = b + binery;
            n=n/2;
        }
        return binery;
    }

     static int sumDigits(int n) {
        String binery = bineryary(n);
        int count = 0;

        for(int i=0; i<binery.length(); i++)
            if(binery.charAt(i)=='1')
                count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        System.out.println(sumDigits(n));
    }
}
