// patern this program
//       a
//      abc
//     abcde
//    abcdefg
//   abcdefghi

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n=sc.nextInt();
        sc.close();
        int x=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print( " ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print((char)(j+96));
            
            }
            System.out.println();
        }
    }
}
