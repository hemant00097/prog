import java.util.Scanner;
public class CalculateFactorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int fact=1,i=2;
        sc.close();
        while(i<n)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("factorial num: "+n+ " is "+fact);
    }

}