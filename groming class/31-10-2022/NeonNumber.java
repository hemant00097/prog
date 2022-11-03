// Write A Java Program To Chckh Entered Number Is Neon Number Or Not   
// 9 =9*9 = 81   and 8+1 =9  neao number 

import java.util.Scanner;

public class NeonNumber {
    static boolean isNeon(int n)
    {
     int sq=n*n, sum=0;
     do
     {
        int id=sq%10;
        sum=sum+id;
        sq=sq/10;     
     }while (sq>0); 
     return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        sc.close();
        if(isNeon(n))
        {
        System.out.println("The Number is Neon Number ");
        }
        else
        {
        System.out.println("The number is not neon Number");
        }
    }
 }