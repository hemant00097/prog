// WAJP to read n integer elemant from the user and print sum all those element 
// i/p ={ 40,60,20,40,40} 
// o/p ={ the sum of all elemant is-200}

import java.util.Scanner;
public class Q2
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of anarray");
        int n=sc.nextInt();
        int [] ar=new int[n];
        System.out.println("Enter the "+n+"Integer value");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        System.out.println("sum of array element is:"+sum);
        sc.close();
    }
    
}