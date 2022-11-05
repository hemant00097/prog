// patern this program 
//                1
//             2  3  
//          4  5  6
//       7  8  9 10 
//   11 12 13 14 15
import java.util.Scanner;
public class Q4
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        sc.close();
        for(int i=1 ;i<=n;i++)
        {
            int x=i;
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1 ;j<=i ;j++)
            {
                x=x+1;
                System.out.print(x+"");

            }
            System.out.println();
        }
        
    }
}
