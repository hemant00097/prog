import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number ");
        int length=sc.nextInt();
        int berathe=sc.nextInt();
        sc.close();
        int Rectangle=length*berathe;
        int perimeter= 2*(length+berathe);
        System.out.println("Area of Rectangle: "+Rectangle);
        System.out.println("Perimeter if Rectangle: "+perimeter);


    }
    
}
