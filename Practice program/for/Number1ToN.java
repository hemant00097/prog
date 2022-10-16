import java.util.Scanner;

public class Number1ToN
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int  n=sc.nextInt();
        sc.close();
        for(int i=0;i<=n;i++)
        {
            System.out.print( i+" " );
        }
        System.out.println("Thanks You");
    }
}