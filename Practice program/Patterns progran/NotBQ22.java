//     petterns is program
//             1
//            101
//           10101
//          1010101
//         101010101

import java.util.Scanner;
class NotBQ22
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
                  System.out.print(j%2+"");
               }
            System.out.println();
        }
    }
}