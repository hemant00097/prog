//   pattern this program
//     4321234
//      32123
//       212
//        1
//       212
//      32123
//     4321234            no

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        sc.close();
        int sp=0,st=n ,pt=n/2+1;
        for( int i=1 ;i<=n ;i++)
        {
            for(int j=1 ; j<=sp ;j++)
            {
                System.out.print(" ");
            }
            int x=pt;
            for(int j=1 ; j<=st ;j++)
            {
                System.out.print(x+"");
                 if(j<=st/2)
                 {
                    x--;
                 }
                 else
                 { 
                   x++;
                 }
            }
            if(i<=n/2)
            {
                sp++;
                pt--;
                st=st-2;
            }
            else 
            {
                sp--;
                pt++;
                st=st+2;
            }
            System.out.println();
        }
    }
}




