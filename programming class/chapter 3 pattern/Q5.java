/*   petterns is program
 *                1
 *              0 0 0
 *            1 1 1 1 1 
 *          0 0 0 0 0 0 0
 *        1 1 1 1 1 1 1 1 1
 */

import java.util.Scanner;
class Q5
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  Number");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1 ;j<=n-i;j++)
             {
               System.out.print(" ");
             }
             for(int j=1;j<=2*i-1;j++)
               {
                  System.out.print(i%2+"");
               }
            System.out.println();
        }
    }
}