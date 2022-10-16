import java.util.Scanner;
class NumberNTo1
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sc.close();
        for(int i=n;i>-1;i--)
        {
            System.out.print(i+ " ");
        }
        System.out.println("Thanks you");
    }
}