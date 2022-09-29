import java.util.Scanner;

class EqualOrNot
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two  Number ");
        int a= sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if(a==b)
        {
            System.out.println(" This is a Equal ");
        }
        if(a!=b)
        {
            System.out.println("This is not Equal ");
        }
    }
}