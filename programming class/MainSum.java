import java.util.Scanner;
public class MainSum {
    static int sumofN(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum=sum+n;
            n--;
        }
        return sum;
    }
  public static void main(String[] args) {
    System.out.println("main mather Start");
    int s1=sumofN(5);
    System.out.println("Sum of first 5 natural number is: "+s1);
    int x=7;
    int s2=sumofN(x);
    System.out.println("sum of First "+x+ " natural number is: " +s2);
    System.out.println("Sum of 8 natural number is: "+sumofN(8));
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the value of  number");
    int n=sc.nextInt();
    sc.close();
    int s3=sumofN(n);
    System.out.println("sum of first "+n+"natural number is: "+s3);
    
  }  
}
