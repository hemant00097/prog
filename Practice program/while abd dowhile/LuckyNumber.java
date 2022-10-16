import java.util.Scanner;
public class LuckyNumber {
    static boolean islucky(int n)
    {
        while(n>9)
        {
            int sum=0;
        do{
            int r=n%10;
            sum=sum+r;
            n=n/10;
         }while(n!=0);
        n= sum;
        }
        return n==9;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        sc.close();
        System.out.println(islucky(x));
    }
}
