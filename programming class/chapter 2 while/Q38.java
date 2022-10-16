
import java.util.Scanner;

public class Q38 {
   static boolean isperfact(int x)
   {
    int sum=0;
    for(int i=1;i<=x/2;i++)
    {
        if(x%i==0)
        sum=sum+i;
    }
    return sum==x;
   } 
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Number");
    int n=sc.nextInt();
    boolean rs=isperfact(n);
    sc.close();
    if(rs==true)
    System.out.println(n+" is a perfect Number");
    else
    System.out.println(n+" is a not perfect Number");
   }
}
