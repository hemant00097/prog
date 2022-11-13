// Write a java program to define a method to print frequency of each array elements
// i/p= array[23,45,23,47,68,45]
// o/p  23 ->2
//      45 ->2
//      47 ->1
//      68 ->1

// public class Q30 {
//     public static void main(String[] args) {
//         int ar[]={ 23,45,56,45,58,45,58,25};
//         int big=ar[0];
//         for(int i=1 ;i<ar.length;i++)
//         {
//             if(big<ar[i])
//             big=ar[i];
//         }
//         int count[]=new int[big+1];
//         for(int i=0;i<ar.length;i++)
//         {
//             count[ar[i]]++;
//         }
//         for(int i=0; i<count.length;i++)
//         {
//             if(count[i]!=0)
//             System.out.println(i+"-> "+count[i]);
//         }
//     }
//  }   

import java.util.Scanner;
public class Q30
{
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
        System.out.println(ar[i]+" ");
      }
    }
    public static void PrintFequency(int[] ar)
    {
      boolean rs[]=new boolean[ar.length];
      for(int i=0;i<ar.length ;i++)
      {
        if(rs[i]==false)
        {
            int count=1;
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    count++;
                    rs[j]=true;
                }
            }
            System.out.println(ar[i]+" present "+count);
        }
      }   
    }
    public static void main(String[] args) 
    {
        int a[] =readArray();
        System.out.println("Before ");
        disPlay(a);
        PrintFequency(a);
        
    }
}