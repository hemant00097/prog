// WAJP to defind a method to return how many palindrome numbers present in tha array
// i/p=[12,34,232,43,565,678,898]
// o/p= the number of palindrome number are -3
import java.util.Scanner;
public class Q12 {
    static boolean palindromeNumber(int n)
    {
        int rev=0,temp=n;
        do
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        while(n!=0);
        return temp==rev;
    }
    static int countDigit(int ar[])
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(palindromeNumber(ar[i]))
            {
                count++;
            }
        }
        return count;
    }
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the "+n+"integer value");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static void main(String args[])
    {
        System.out.println("the number of palindrome number are "+countDigit(readArray()));
    }
}