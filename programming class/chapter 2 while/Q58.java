import java.util.Scanner;

public class Q58 {
    static double pow(double n, int p) {
        double pw=1;
        while(p>0) {
            pw= pw * n;
            p--;
        }
        return pw;
    }

    static double futureInvest(double pv, double i, int n) {
        double per = i/100;
        return pv * (pow((1+per), n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Present Value");
        double pv = sc.nextDouble();
        System.out.println("Enter the Interest Percentage");
        double i = sc.nextDouble();
        System.out.println("Enter the Number of period in Years");
        int n = sc.nextInt();
        sc.close();

        System.out.println("FV: "+ futureInvest(pv,i,n));
    }
}