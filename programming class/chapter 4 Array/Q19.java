//WAJP  define a method to return how many prime number present between 100 and 1000 present in the array 
// i/p =[103,646,101,788,107]   
// o/p = The Number of prime number between 100 and 1000 are -3

import java.util.Scanner;
public class Q19
 {
    static boolean isPrime(int n)
    {
        if(n<100 || n>1000)
        {
            return false;
        }
        else 
        {
            for(int i=2;i<n/2;i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    static int primeCount(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(isPrime(arr[i]))
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
        int ar[]=new int[n];
        System.out.println("Enter the "+n+" integer value");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        sc.close();
        return ar;
    }
    public static void main(String args[])
    {
        System.out.println("the number of prime numbers between 100 and 1000 are "+primeCount(readArray()));
    }
    
}