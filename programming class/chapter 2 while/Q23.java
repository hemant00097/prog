import java.util.Scanner;

public class Q23 {
    private static int fact(int n)
    {
        int fact=1;
        while(n>1){
         fact=fact*n;
         n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sc.close();
        System.out.println(fact(n));
    }
}
