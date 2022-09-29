import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age ");
        int age= sc.nextInt();
        sc.close();
        if(age>=18 && age<=100)
        System.out.println("You are Elagable to vote");
        else 
        System.out.println("You are Not Elagable to vote");
        
    }
    
}
