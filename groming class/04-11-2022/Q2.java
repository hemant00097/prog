// patern this program 
//    1 * * * * 
//    1 2 * * * 
//    1 2 3 * * 
//    1 2 3 4 * 
//    1 2 3 4 5 
import java.util.Scanner;
public class Q2
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        sc.close();
        for(int i=1 ;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=2 ;j<=n-i+1 ;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
    }
}