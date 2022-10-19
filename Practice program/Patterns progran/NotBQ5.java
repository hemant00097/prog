import java.util.Scanner;
class NotBQ5
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  Number");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=n ;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println( );
        }
    }
}


