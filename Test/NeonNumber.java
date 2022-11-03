// Write A Java Program To Chckh Entered Number Is Neon Number Or Not   
import java.util.Scanner;

public class NeonNumber {
    static boolean isNeon(int n)
    {
     int sq=n*n,sum=0,temp=n;
     while(sq!=0)
     {
        int r=sq%10;
        sum=sum+r;
        sq=sq/10;     
     }
     return sum==temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        boolean b= isNeon(num);
        sc.close();
        if(b==true)
        {
        System.out.println("The Number is Neon Number ");
        }
        else
        {
        System.out.println("The number is not neon Number");
        }
    }
 }