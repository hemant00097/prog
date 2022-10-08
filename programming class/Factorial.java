import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the nubmer");
        int n=sc.nextInt();
        int fact=1;
        int i=2;
        sc.close();
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial no: "+n+" is "+fact);
    }
}

