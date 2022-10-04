import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number ");
        int a=sc.nextInt();
        sc.close();
        int x1=a/10;
        int x2=a%10;
        int sum=x1*x2+x1+x2;
        if(sum==a)
        System.out.println(a+" is Special two  Number");
        else
        System.out.println(a+" is Not special two Number ");

    }
}

