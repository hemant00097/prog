// WAJP TO Define a method to return how many even number present in the array with in 100.
// i/p=[23,45,44,28,67,64,886]
// o/p=the number of even number within are -3
import java.util.Scanner;
public class Q11 {
    static boolean evenNumber(int n)
    {
        if(n>100)
        {
            return false;
        }
        else 
        {
            if(n%2==0)
            {
                return true;
            }
        }
        return false;
    }
    static int oddCount(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(evenNumber(arr[i]))
            {
                count++;
            }
        }
        return count;
    }
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the "+n+" integer value");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        sc.close();
        return ar;
    }
    public static void main(String args[])
    {
        System.out.println("the number of odd number within 100 are "+oddCount(readArray()));
    }
    
    
}