import java.util.Scanner;
class NotBQ4
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  Number");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1 ;j<=n;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println( );
        }
    }
}


