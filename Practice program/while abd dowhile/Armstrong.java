import java.util.Scanner;

public class Armstrong {
   static int countDigit(int x)
   {
    int count=0;

    do{
        x=x/10;
        count++;
    } while(x!=0);

    return count;
   }
    
   static int pow(int n,int p)
   {
    int pw=1;
    while(p>0)
    {
        pw=pw*n;
        p--;
    }
    return pw;
   }

   static boolean isArmstrong(int n)
   {
    int sum=0,t=n;
    int dc=countDigit(n);

    do{
        int r=n%10;
        sum = sum+pow(r,dc);
        n=n/10;
    } while(n!=0);

    return t==sum;
   }
   static void printArm(int n)
   {
    for(int i=0;i<=n;i++)
    if(isArmstrong(i))
    System.out.print(i+" ");
   }


   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    printArm(num);
    sc.close();
   }
}
