import java.util.Scanner;
public class OneToN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int i=1;
        sc.close();
        while(i<=n)
        {
            System.out.println(i);
            //System.out.println("Hemant");
            i++;
        }
        System.out.println("Thanks you");
    } 
}
