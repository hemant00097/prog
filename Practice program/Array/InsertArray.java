//Define a method to insert one Array elemant at the Specificed index 
import java.util.Scanner;
public class InsertArray {
    public static int[] readArray() 
    {
      Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] ar = new int[n];
        System.out.print("Enter the "+n+" integer valur");
        for(int i=0; i<ar.length; i++) 
        {
            ar[i] = sc.nextInt();
        }
        return ar;
    }
  
    static void disArray(int arr[])
    {
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
    }
    public static int[]  insertArr(int ar[],int ele ,int in )
    {
       if(in<0 && in>ar.length)
      {
        System.out.println("index not in the range ");
        return ar;
      } 
       int [] br=new int[ar.length+1];
       br[in]=ele;

       for(int i=0;i<ar.length ;i++)
       {
        if(i<in)
        br[i]=ar[i];
        else
        br[i+1]=ar[i];
       }
       return br;
    }
    public static void main(String[] args) 
    {
        System.out.print(" Read Array ");
        int  a[]=readArray();
        a=insertArr(a, 39, 2);
        System.out.print(" After Insert ");
        disArray(a);


        
    }
}


