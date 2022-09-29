import java.util.Scanner;
public class NegtOrPossIfElse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number ");
        int a=sc.nextInt();
        sc.close();
        if(a>=0)
        System.out.println(a +" is Possitive Number");
        else
        System.out.println(a +" is Negitive Number");    
    }
}
