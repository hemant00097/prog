import java.util.Scanner;
public class HappyNumber {
    static boolean isHappy(int n)
    {
        while(n>9)
        {
            int sum=0;
        while(n!=0)
         {
            int r=n%10;
            sum=sum+r;
            n=n/10;
         }while(n!=0);
        n= sum;
        }
        return n==1 || n==7;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        sc.close();
        System.out.println(isHappy(x));
    }
}

