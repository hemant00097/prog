//     print this pettern
//       55555
//       44444 
//       33333
//       22222 
//       11111

import java.util.Scanner;
class NotBQ6
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  Number");
        int n=sc.nextInt();
        sc.close();
        for(int i=n;i>=1;i--)
        {
            for(int j=n ;j>=1;j--)
            {
                System.out.print(i+" ");
            }
            System.out.println( );
        }
    }
}

