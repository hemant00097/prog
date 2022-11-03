// wap to read the integer value from thw user and sum of all they data
import java.util.Scanner;

public class SumofAllData {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] ar=new int [n];
        System.out.println("Enter the "+n+" interger value ");
        for(int i=0 ;i<ar.length ;i++)
        {
            ar[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<ar.length ;i++)
        {
            sum=sum+ar[i];
        }
        System.out.println("Sum of arrey Element is "+sum);
    }
}
