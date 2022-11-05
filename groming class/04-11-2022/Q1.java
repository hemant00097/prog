// patern this program 
//    5 4 3 2 1
//    * 4 3 2 1
//    * * 3 2 1
//    * * * 2 1
//    * * * * 1
import java.util.Scanner;
public class Q1
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        sc.close();
        for(int i=1 ;i<=n;i++)
        {
            for(int j=2;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=n-i+1 ;j>=1 ;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}