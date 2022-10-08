import java.util.Scanner;
public class Nto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the nubmer");
        int n=sc.nextInt();
        sc.close();
        while(n>=15)
        {
        System.out.println(n);
       // System.out.println("Hemant");
        n--;
        }
        System.out.println("thanks you");
    }
}
