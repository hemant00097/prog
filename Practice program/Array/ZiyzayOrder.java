//Write a program to defind a method two Array in ZiyZay Order
// i/p  a={1,2,3,4}  b={5,6,7,8}
// o/p  c={1,5,2,6,3,7,4,8}
// import java.util.Scanner;

// public class ZiyzayOrder 
// {
//         public static int [] readaray()
//     {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the size of array");
//         int n=sc.nextInt();
//         int ar[]=new int[n];
//         System.out.println("Enter the "+n+ " integer value ");
//         for(int i=0 ;i<ar.length;i++)
//         {
//             ar[i]=sc.nextInt();
//         }
//         return ar;
        
//     }
//     public static void disparey(int [] ar)
//     {
//         for(int i=0 ;i<ar.length ;i++)
//         {
//             System.out.print(ar[i]+" ");
//         }
//         System.out.println();
//     }
//     public static int [] ziyzay(int []a,int[]b)
//     {
//         int c[]=new int[a.length+b.length];
//         int i=0,j=0;
//         while(i<a.length && i<b.length)
//         {
//             c[j++]=a[i];
//             c[j++]=b[i++];
//         }
//         while(i<a.length)
//         {
//             c[j++]=a[i++];
//         }
//         while(i<b.length)
//         {
//             c[j++]=b[i++];
//         }
//         return c;
//     }

//     public static void main(String[] args) 
//     {
//         System.out.println("Read the First Array");
//         int a[]=readaray();
//         System.out.println("Read the Second Array ");
//         int b[]=readaray();
//         int c[]=ziyzay(a, b);
//         System.out.print("ziyzay Array Element ");
//         disparey(c);
        
//     }
// }

public class ZiyzayOrder{
  
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]={5,6,7,9};
        int c[]=new int[a.length+b.length];
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            c[j]=
        }
    }
}