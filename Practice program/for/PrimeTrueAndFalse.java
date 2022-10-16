import java.util.Scanner;

public class PrimeTrueAndFalse {
    static boolean isprime(int x)
    {
        for(int i=2 ;i<=x/2;i++)
        {
            if(x%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        sc.close();
       // System.out.println(isprime(n));
       boolean rs=isprime(n);
       if(rs==true)
       System.out.println(n+" is a prime number");
       else
       System.out.println(n+" is not prime number");
    }
}
