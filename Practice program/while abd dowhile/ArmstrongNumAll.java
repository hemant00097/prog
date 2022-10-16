import java.util.Scanner;
public class ArmstrongNumAll 
{
    static int countdigit(int x)
    {
        int count=0;
        do{
            x=x/10;
            count++;
         }while(x!=0);
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
        int sum=0,temp=n;
        int dc=countdigit(n);
        
        do{
            int r=n%10;
            sum=sum+pow(r,dc);
            n=n/10;
         }while(n!=0);
         return sum==temp;
            
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        sc.close();
        System.out.println(isArmstrong(num));
    }
}

