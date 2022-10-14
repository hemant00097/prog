import java.util.Scanner;

public class MainSum {
    static int sumofn(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum=sum+n;
            n--;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("main method started");
        int s1=sumofn(5);
        System.out.println("sum of first 5 naturel number is : "+s1);
        int x=7;
        int s2=sumofn(x);
        System.out.println("sum of first "+ x +" naturel number is : "+s2);
        System.out.println("sum of first 8 naturel number is : "+sumofn(8));
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the number");
        int s3=sumofn(n);
        System.out.println("sum of first "+n+ "naturel number is : "+s3);
        sc.close();


    }
}
