import java.util.Scanner;

public class ReversNum {
    static int revers(int n)
    {
        int rev=0;
        do{
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }while(n!=0);

        return rev;
    }
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number ");
    int i=sc.nextInt();
    sc.close();
    System.out.println(revers(i));
   

 }
}
