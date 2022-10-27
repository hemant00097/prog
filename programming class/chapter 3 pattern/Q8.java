//     petterns is program
//             1
//            010
//           10101
//          0101010
//         101010101

import java.util.Scanner;
class Q8
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  Number");
        int n=sc.nextInt();
        sc.close();
        int x=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1 ;j<=n-i;j++)
             {
               System.out.print(" ");
             }
             for(int j=1;j<=2*i-1;j++)
               {
                  System.out.print(x%2+"");
                  x++;
                
               }
            System.out.println();
        }
    }
}
