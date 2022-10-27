//   pattern this program
//          1
//         121
//        12321
//       1234321
//        12321
//         121
//          1

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        sc.close();
        int sp=n/2,st=1;
        for( int i=1 ;i<=n ;i++)
        {
            for(int j=1 ; j<=sp ;j++)
            {
                System.out.print(" ");
            }
            int x=1;
            for(int j=1 ; j<=st ;j++)
            {
                System.out.print((char)(x+64)+"");
                if(j<=st/2)
                x++;
                else
                x--;
            }
            if(i<=n/2)
            {
                sp--;
                st=st+2;
            }
            else 
            {
                sp++;
                st=st-2;
            }
            System.out.println( );
        }
    }
}


