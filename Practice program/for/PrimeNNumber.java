import java.util.Scanner;

public class PrimeNNumber {
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
        for(int i=1 ;i<=n;i++)
        {
            boolean rs=isprime(i);

            if(rs==true)
           System.out.print(i +" ");
        }
    }
}

