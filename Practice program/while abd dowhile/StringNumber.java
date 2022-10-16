import java.util.Scanner;

public class StringNumber {
    static int getfact(int x)
    {
        int prod=1;
        while(x>1)
        {
            prod=prod*x;
            x--;
        }
        return prod;
    }
    static boolean isstring(int n)
    {
        int sum=0,t=n;
        do{
            int r=n%10;
            sum=sum+getfact(r);
            n=n/10;
        }while(n!=0);
        return sum==t;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        System.out.println(isstring(num));
        sc.close();

    }
    }

