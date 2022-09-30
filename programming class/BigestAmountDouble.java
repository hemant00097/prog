import java.util.Scanner;

public class BigestAmountDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the four Number ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        sc.close();
        double big =a;
        if(b>big)
        big=b;
        if(c>big)
        big =c;
        if(d>big)
        big = d;
        System.out.println(big + " is  Biggest Amount");
    }
}
