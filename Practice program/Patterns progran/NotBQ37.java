//   pattern this program
//          4
//         343
//        23432
//       1234321
//        23432
//         343
//          4

import java.util.Scanner;

public class NotBQ37 {
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
            int x=sp+1;
            for(int j=1 ; j<=st ;j++)
            {
                System.out.print(x+"");
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

