/*   petterns is program
 *        5 4 3 2 1
 *          4 3 2 1
 *            3 2 1
 *              2 1
 *                1
 */
import java.util.Scanner;
class Q12
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  Number");
        int n=sc.nextInt();
        sc.close();
        for(int i=n;i>=1;i--)
        {
            for(int j=1 ;j<=n-i;j++)
            {
                System.out.print(" ");
            }
           for(int j=i; j>=1 ;j--)
           {
              System.out.print(j+"");
           }
            System.out.println( );
        }
    }
}
