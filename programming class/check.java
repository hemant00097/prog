import java.util.Scanner;
public class check
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nubber");
        int n=sc.nextInt();
        sc.close();
        if(n%3==0 && n%5==0)
          System.out.println("Sanju Weds Geeta");
    
        else if(n%3==0)
            System.out.println("Geeta");
         else if(n%5==0)
        
            System.out.println("sanju");
        else 
            System.out.println("break up");
        
    }
}