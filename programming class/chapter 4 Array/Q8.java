//WAJP  define a method to return how many odd number are present in the array 
// i/p =[23,42,24,56,3,7]   
// o/p = The Number of odd number are - 3

import java.util.Scanner;
public class Q8 
{
    static boolean oddNumber(int n)
    {
        if(n%2!=0)
        {
            return true;
        }
        return false;
    }
    static int oddCount(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(oddNumber(arr[i]))
            {
                count++;
            }
        }
        return count++;
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
        System.out.println("the number of odd number are "+oddCount(readArray()));
    }
}