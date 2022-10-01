import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int Add=a+b;
        int sub=a-b;
        int multi=a*b;
        int div =a/b;
        System.out.println("Addition: "+Add);
        System.out.println("Subtraction: "+sub);
        System.out.println("Multiplication: "+multi);
        System.out.println("Divsion: "+div);


    }
    
}

