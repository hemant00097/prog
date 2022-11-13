// Write a program to count all the even numbers and odd numbers present  in the array
// i/p= array [12,33,45,44,77,68,64]
// o/p = even number are ->4
//       odd number are  ->3

import java.util.Scanner;
public class Q37 
{
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the "+n+" Integer value");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        sc.close();
        return ar;
        
    }
    static void disArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int  countEven(int ar[])
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]%2==0)
            {
                count++;
            }
        }
        return count;
    }
    static int countOdd(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        System.out.println("Read array");
        int ar1[]=readArray();
        System.out.println("user enter array");
        disArray(ar1);
        System.out.println("even number "+countEven(ar1));
        System.out.println("Odd number "+countOdd(ar1));
    }
    
}