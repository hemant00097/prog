// print this peatern
//      1
//      2 3
//      4 5 6
//      7 8 9 1  
//      2 3 4 5 6 

import java.util.Scanner;
public class Q24
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        sc.close();
        int x=1;
        for(int i=1 ;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(x+" ");
                if(x>=9)
                {
                    x=0;
                }
                x++;
            }
          System.out.println();
        }
    }
}