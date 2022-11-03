// WAP to defind a method to return the Smallest element in the Array 

import java.util.Scanner;
public class SmallestArr {
		static double getsmallest(double []ar)
		{
			double Small=ar[0];
			for(int i=1;i<ar.length;i++)
			{
				if(ar[i]<Small)
					Small=ar[i];
			}
			return Small;
    
		}
		static double[] readArray()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of an Array");
			int n=sc.nextInt();
			double[] ar=new double[n];
			System.out.println("Enter the" +n+ "integer values");
			for(int i=0; i<ar.length; i++)
			{
				ar[i] =sc.nextInt();
			
			}
			return ar;
		}
		static void displayArray(double[] ar) {
		for (int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+"");
		}
    
		System.out.println();
		}
    
		public static void main(String[] args) 
        {
		
			double[] x=readArray();
			double s1= getsmallest(x);
			 System.out.println("Smallest is:"+s1);
		}
	
	}