import java.util.Scanner ;
public class NegtivPositivZero {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  Number ");
        int a= sc.nextInt();
        if(a>0)
        System.out.println(a+ " is Positive Number ");
        if(a<0)
        System.out.println(a+ " is Negativ Number ");
        if(a==0)
        System.out.println(a+ " is Zero ");
    }
}