import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number ");
        int n=sc.nextInt();
        sc.close();
        if(n==1 || n==3 || n==5 || n==7  || n==8 || n==10 ||n==12)
        System.out.println(n+"Month has 31 Day");
        if(n==4 || n==6 || n==9 || n==11)
        System.out.println(n+" Month has 30 Day ");
        if(n==2)
        System.out.println(n+" Month has 28 or 29 Day");
        else
        System.out.println(" Invalid Number ");

    }
}
