// WAJP to defind a method to return how many prime numbers present in tha array
// i/p=[151,648,163,864,113,654,173,197,1234,4346]
// o/p= the number of prime number with in 1000 -5
import java.util.Scanner;
public class Q14 {
    static boolean isPrime(int n)
    {
        if(n>1000)
        {
            return false;
        }
        else 
        {
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    static int countDigit(int ar[])
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(isPrime(ar[i]))
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
        System.out.println("the number of prime number within 1000 "+countDigit(readArray()));
    }
}
