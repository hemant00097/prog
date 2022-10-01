import java.util.Scanner;
public class SmallAmount 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three Number ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        if(a<b)
        {
            if(a<c)
            System.out.println(a+ " is Smallest ");
            else 
            System.out.println(c + " is Smallest ");
        }
       else 
       {
        if(b<c)
        System.out.println(b+ " is Smallest ");
        else 
        System.out.println(c+ " is Smallest ");
       }

    }
    
}
