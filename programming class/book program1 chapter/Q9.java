import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Amount ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        if(a>=b)
        System.out.println(a+" is Biggest Number");
        else
        System.out.println(b+" is Biggest Number ");

    }
}

