// print this patern
//     12321
//     12 21
//     1   1
import java.util.Scanner;
class Q6
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  Number");
        int n=sc.nextInt();
        sc.close();
        for(int i=n;i>=1;i--)
        {
            for(int j=1 ;j<=i;j++)
             {
               System.out.print(j);
             }
             for(int j=1;j<=2*(n-i)-1;j++)
               {
                  System.out.print(" ");
               }
               for(int j=i ;j>=1 ;j--)
               {
                if(j==n)
                {
                    System.out.print("");
                }
                else{
                    System.out.print(j);
                }
               }

            System.out.println();
        }
    }
}
