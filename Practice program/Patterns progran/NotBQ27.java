//    patterns is prigram
     
//       A 
//       B B 
//       C C C 
//       D D D D 
//       E E E E E

import java.util.Scanner;
class NotBQ27
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  Number");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1 ;j<=i;j++)
            {
                System.out.print((char)+(i+64)+" ");
            }
            System.out.println( );
        }
    }
}



