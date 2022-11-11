// WAJP to defind a method to return how many odd numbers present in tha array with in 1000
// i/p=[24,56,3,7,11,46,678,345,124,121,1234,1231]
// o/p= the number of odd number with in 1000 are -6
import java.util.Scanner;
public class Q15
 {
    static boolean oddNumber(int n)
    {
        if(n>1000)
        {
            return false;
        }
        else 
        {
            if(n%2!=0)
            {
                return true;
            }
        }
        return false;
    }
    static int countDigit(int ar[])
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(oddNumber(ar[i]))
            {
                count++;
            }
        }
        return count;
    }
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the "+n+"  integer value");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static void main(String args[])
    {
        System.out.println("the number of odd number are "+countDigit(readArray()));
    }
}