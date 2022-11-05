// patern this program 
//          A
//        C C C 
//      E E E E E
//    G G G G G G G
//  I I I I I I I I I
import java.util.Scanner;
public class Q3
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        sc.close();
        for(int i=1 ;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1 ;j<=2*i-1 ;j++)
            {
                System.out.print((char)(2*i+63)+"");
            }
            System.out.println();
        }
        
    }
}