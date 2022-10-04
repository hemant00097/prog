import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Amount ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        int big=a;
        if(big<b)
        big=b;
        if(big<c)
        big=c;
        System.out.println(big+" is Biggest Number ");

    }
}
