// WAP to print the n number of fibonnaci series
import java.util.Scanner;
public class Q21
{
    //first n fibonnaci number 
    static void printfibonnaci(int n)
    {
        int f1=0,f2=1;
        while(f1<=n)
        {
            System.out.println(f1+" ");
            int f3=f1+f2;
            f1=f2;
            f2=f3;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sc.close();
        printfibonnaci(n);
        
    }
}
