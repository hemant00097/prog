// WAJP to defind a method to reverse the element present in tha array.
// i/p=[12,34,57,43,56]
// o/p= after the reverse [65,43,57,34,12]

import java.util.Scanner;
public class Q21 {
    static int[] readArray()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int n=sc.nextInt();
       int ar[]=new int[n];
       System.out.println("Enter the "+n+ " integer value ");
       for(int i=0 ;i<ar.length;i++)
       {
        ar[i]=sc.nextInt();
       }
       return ar;
    }
    static void disPlay(int ar[])
    {
      for(int i=0;i<ar.length;i++)
      {
        System.out.print(ar[i]+" ");
      }
      System.out.println();
    }
    public static void reverseArr(int[] ar)
    {
      int i=0 ,j=ar.length-1;
      while(i<j)
      {
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
        i++;
        j--;
      }   
    }
    public static void main(String[] args) 
    {
        
        int a[] =readArray();
        System.out.println("before replace");
        disPlay(a);
        reverseArr(a);
        System.out.println("After Replace ");
        disPlay(a);
        
    }
}