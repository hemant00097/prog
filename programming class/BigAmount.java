import java.util.Scanner;
public class BigAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Two Number ");
        int a=sc.nextInt();
        int b= sc.nextInt();
        sc.close();
        if(a>=b)
        System.out.println(a +" a is biggest NUmber ");
        else 
        System.out.println(b +" b is biggest NUmber ");

    }
}
