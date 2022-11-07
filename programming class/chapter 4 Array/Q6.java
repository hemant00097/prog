// WAJP to define a method to return how many prime number present in the array element
// i/p =[23,56,3,7,11,46]
// o/p =[the number of prime number are -3]
import java.util.Scanner;
public class Q6
 {
    static boolean isPrime(int n)
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
       System.out.println("Enter the size");
       int n=sc.nextInt();
       int ar[]=new int[n];
       System.out.println("Enter the "+n+ "integer value");
       for(int i=0;i<ar.length;i++)
       {
        ar[i]=sc.nextInt();
       }
       sc.close();
       return ar;
    }
    public static void main(String args[])
    {
        System.out.println("Prime number  "+primeCount(readArray()));
    }
    
}
