// WAP to definr a  java program to define a method to merge 2 array elemant into single array in zigzag order (simultaneously) 
// i/p =Array 1  [2,8,96,7,4]
//     Array 2 [11,22,33]
// o/p = [2,11,8,22,9,33,6,7,4]

import java.util.Scanner;

public class Q26 
{
        public static int [] readaray()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the "+n+ " integer value ");
        for(int i=0 ;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        return ar;
        
    }
    public static void disparey(int [] ar)
    {
        for(int i=0 ;i<ar.length ;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static int [] ziyzay(int []a,int[]b)
    {
        int c[]=new int[a.length+b.length];
        int i=0,j=0;
        while(i<a.length && i<b.length)
        {
            c[j++]=a[i];
            c[j++]=b[i++];
        }
        while(i<a.length)
        {
            c[j++]=a[i++];
        }
        while(i<b.length)
        {
            c[j++]=b[i++];
        }
        return c;
    }

    public static void main(String[] args) 
    {
        System.out.println("Read the First Array");
        int a[]=readaray();
        System.out.println("Read the Second Array ");
        int b[]=readaray();
        int c[]=ziyzay(a, b);
        System.out.print("ziyzay Array Element ");
        disparey(c);
        
    }
}

// public class Q26 {
  
//     public static void main(String[] args) {
//         int a[]={2,8,96,7};
//         int b[]={11,22,33,44};
//         int c[]=new int[a.length+b.length];
//         int j=0;
//         for(int i=0;i<a.length;i++)
//         {
//             c[j]=a[i];
//             j++;
//             c[j]=b[i];
//             j++;
//         }
//         for(int n=0;n<c.length;n++)
//         {
//             System.out.print(c[n]+" ");
//         }
//     }
// }
