// Write a java program to count how many even element and how many odd number present in the array 
// i/p =array[23,44,65,78,96,53,22]
// o/p = even element are ->44,78,96,22
//      odd  element are -> 23,65,53

import java.util.Scanner;
public class Q40
{
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the "+n+"Integer value");
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
    static int[] evenPresent(int ar[])
    {
        int []evenArray=new int [countEven(ar)];
        int j=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]%2==0)
            {
                evenArray[j++]=ar[i];
            }
        }
        return evenArray;
    }
    static int[] oddPresent(int arr[])
    {
        int oddArray[]=new int[countOdd(arr)];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
             oddArray[j++]=arr[i];
            }
        }
        return oddArray;
    }
    public static void main(String args[])
    {
        System.out.println("read array");
        int ar1[]=readArray();
        System.out.println("User enter array");
        disArray(ar1);
        System.out.println("even number ");
        disArray(evenPresent(ar1));
        System.out.println("odd number");
        disArray(oddPresent(ar1));
    }

    
}