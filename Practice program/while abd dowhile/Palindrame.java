import java.util.Scanner;

public class Palindrame {
    static boolean ispalindrame(int n)
    {
        int rev=0;
        int temp=n;
        do{
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }while(n!=0);

        return temp==rev;
    }
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number ");
    int i=sc.nextInt();
    sc.close();
    System.out.println(ispalindrame(i));
   

 }
}

