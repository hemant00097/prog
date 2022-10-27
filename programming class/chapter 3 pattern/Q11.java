//     petterns is program
//              5
//            4 5 
//          3 4 5 
//        2 3 4 5 
//      1 2 3 4 5 

import java.util.Scanner;
class Q11
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  Number");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=i ;j<=n;j++)
             {
               System.out.print(j+" ");
             }
            
            System.out.println();
        }
    }
}



