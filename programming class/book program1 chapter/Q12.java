import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The number ");
        int a=sc.nextInt();
        sc.close();
        if(a%2==0)
        System.out.println(a+" is a even number");
        else
        System.out.println(a+" is a odd number ");

    }
}

