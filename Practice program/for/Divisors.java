import java.util.Scanner;

public class Divisors {
    
    static int divisors(int x)
    {
        int count=0;

     for(int i=1;i<=x;i++)
     {
        if(x%i==0)
        count++;
     }
     return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sc.close();
        int dc=divisors(n);
        System.out.println("number of divisiors of "+n+ " is "+dc);
    }
}
