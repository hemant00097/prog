// Write a java program to print the biggest and lowest element  present in tne array 
// i/p =array [12,23,5,4,76,89,99]
// o/p  the smallest element is 4
//     the biggest element is 99 

import java.util.Scanner;
public class Q35 
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
    static int biggest(int arr[])
    {
        int big=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>big)
            {
                big=arr[i];
            }
        }
           
        return big;
    }
    static int smallest(int ar[])
    {
        int small=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<small)
            {
                small=ar[i];
            }
        }
        return small;
    }
    public static void main(String args[])
    {
        System.out.println("Read Array");
        int arr1[]=readArray();
        System.out.println("User enter Array");
        disArray(arr1);
        System.out.println("Smallest element " +smallest(arr1));
        System.out.println("biggest element " +biggest(arr1));
    }
    
}
