import java.util.Scanner;
public class Q4
 {
    static int Biggest(int ar[])
    {
        int bigg=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>bigg)
            {
                bigg=ar[i];
            }
        }
        return bigg;
    }
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []arr=new int [n];
        System.out.println("Enter the "+n+" integer value");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void main(String args[])
    {
        System.out.println("the smallest element "+Biggest(readArray()));
    }
}