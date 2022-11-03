import java.util.Scanner;

public class PrimeNumberSum {
    static boolean isprime(int x)
    {
        for(int i=2 ;i<=x/2;i++)
        {
            if(x%i==0)
            return false;
        }
        return true;
    }
    static int sumofprime(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            boolean rs=isprime(i);
            if(rs)
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        sc.close();
        int s=sumofprime(n);
        System.out.print("sum of prime number with in "+n+" is "+s);

    }
}


