// wap to define a method to return the average of array element
import java.util.Scanner;
public class AverageArr 
{
    public static int[] UserInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int [] arr=new int[4];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
      }
     public static double Avg(int [] arr)
     {
        int sum=0;
        double avg=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
        avg=sum/arr.length;
        return avg;
     }
     public static void main(String[] args) {
        int a[]=UserInput();
        double val=Avg(a);
        System.out.println("Averrage "+val);
     }
}
