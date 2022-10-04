import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Three Number ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        if(a==b || a==c || b==c)
        System.out.println("Please enter the Distinct value");
        else if(a>b && a>c)
        if(b>c)
        System.out.println(b);
        else
        System.out.println(c);
        else if(b>a && b>c)
        if(a>c)
        System.out.println(a);
        else 
        System.out.println(c);
        else if(c>a && c>b)
        if(a>b)
        System.out.println(a);
        else 
        System.out.println(b);

    }
    
}
