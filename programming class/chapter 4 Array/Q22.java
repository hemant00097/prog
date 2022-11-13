// WAJP to defind a method to combine 2 array element in to single array.
// i/p  array1 =[12,34,56]
//      array2=[36,98,76]
// o/p= [12,36,34,98,56,76]

import java.util.Scanner;
public class Q22 
{
    public int [] readaray()
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
    public void disparey(int [] ar)
    {
        for(int i=0 ;i<ar.length ;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public int [] merge(int []a,int[]b)
    {
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length ;i++)
        {
            c[i]=a[i];
        }
        for(int i=0; i<b.length ;i++)
        {
            c[i+a.length]=b[i];
        }
        return c;
    }
    public static void main(String[] args) 
    {
        Q22 ao=new Q22();
        System.out.println("Read the First Array");
        int a[]=ao.readaray();
        System.out.println("Read the Second Array ");
        int b[]=ao.readaray();
        System.out.println("User enter first Array");
        ao.disparey(a);
        System.out.println("User enter second Array");
        ao.disparey(b);
        int c[]=ao.merge(a, b);
        System.out.print("Marge Array Element ");
        ao.disparey(c);
        
    }
}
