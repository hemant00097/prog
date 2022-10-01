import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int a=sc.nextInt();
        sc.close();
        if(a<0)
        System.out.println(a+" Negitive Number ");
        if(a>0)
        System.out.println(a+" Positive Number ");
        if(a==0)
        System.out.println("Zero");
    }
}
