import java.util.Scanner;

public class Happy {
    static boolean isHappy(int n)
    {
      while(n>9)
      {
        int sum=0;
        while(n!=0)
        {
            int r=n%10;
            sum=sum+r*r;
            n=n/10;
        }
        n=sum;
      }
     return n==1 || n==7;
    }
     static void printhappy(int n)
     {
        for(int i=0;i<=n;i++)
        if(isHappy(i))
        System.out.println(i+" ");
     }
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        printhappy(n);
        sc.close();

     }
}
