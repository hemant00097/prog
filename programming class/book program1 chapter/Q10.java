import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Three Amount ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();

        if(a>b)
        {
          if(a>c)
           System.out.println(a+"  Biggest Number");
           else
           System.out.println(c+"  Biggest Number ");
        }
        else
        {
          if(b>c)
          System.out.println(b+"  Biggest Number");
           else
           System.out.println(c+"  Biggest Number ");

        }

    }
}
