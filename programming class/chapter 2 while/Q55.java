
import java.util.Scanner;
public class Q55 
{
    static double totelpercentage(int a, int b, int c, int d) 
    {
        int total = a + b + c + d;
        return (double)total/4.00;
    }

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Four Subject Marks");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        System.out.println(totelpercentage(a, b, c, d)+"% ");
    }
}
