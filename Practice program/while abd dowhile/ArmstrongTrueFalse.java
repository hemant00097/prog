
import java.util.Scanner;
public class ArmstrongTrueFalse 
{
    static boolean isArmstrong(int n)
    {
        int sum=0,temp=n;
        do{
            int r=n%10;
            sum=sum+r*r*r;
            n=n/10;
         }while(n!=0);
        return sum==temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sc.close();
        System.out.println(isArmstrong(n));
       
    }
}

