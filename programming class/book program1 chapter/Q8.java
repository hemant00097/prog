import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Two Number ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        if(a==b)
        System.out.println("Equal Number");
        else
        System.out.println("Not Equal Number ");

    }
}
